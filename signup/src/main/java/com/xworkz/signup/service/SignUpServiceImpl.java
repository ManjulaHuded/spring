package com.xworkz.signup.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.entity.SignUpEntity;
import com.xworkz.signup.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private SignUpRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	private Set<ConstraintViolation<SignUpDTO>> validate(SignUpDTO signUpDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<SignUpDTO>> vailation = validator.validate(signUpDto);
		return vailation;
	}

	public SignUpServiceImpl() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO signUpDTO) {
		Long emailCount = this.repository.findByEmail(signUpDTO.getEmail());
		Long userCount = this.repository.findByUser(signUpDTO.getUserId());
		Long mobileCount = this.repository.findByMobile(signUpDTO.getMobile());
		log.error("emailCount-" + emailCount);
		log.error("userCount-" + userCount);
		log.error("mobileCount-" + mobileCount);
		if (emailCount == 0 && userCount == 0 && mobileCount == 0) {
			if (signUpDTO.getPassword().equals(signUpDTO.getPassword())) {
				Set<ConstraintViolation<SignUpDTO>> violations = validate(signUpDTO);
				if (violations != null && !violations.isEmpty()) {
					log.info("there is Violation in dto");
					return violations;
				} else {
					log.info("No Violations procceding to save");
					log.error("emailCount--" + emailCount);
					log.error("userCount--" + userCount);
					log.error("mobileCount--" + mobileCount);
					SignUpEntity entity = new SignUpEntity();
					entity.setCreatedBy(signUpDTO.getUserId());
					entity.setCreatedDate(LocalDateTime.now());
					// BeanUtils.copyProperties(signUpDTO, entity);
					entity.setPassword(passwordEncoder.encode(signUpDTO.getPassword()));
					entity.setUserId(signUpDTO.getUserId());
					entity.setEmail(signUpDTO.getEmail());
					entity.setMobile(signUpDTO.getMobile());
					boolean saved = this.repository.save(entity);
					boolean sent = this.sendMail(signUpDTO.getEmail());
					log.info("Saved in Entity-" + saved);
					log.info("Email sent -:" + sent);

				}
			} else {
				log.error("Password must be same");
			}
		} else {
			log.error("User already exsist");
		}
		return Collections.emptySet();
	}

	@Override
	public SignUpDTO signIn(String userId, String password) {
		SignUpEntity entity = this.repository.signIn(userId);
		SignUpDTO dto = new SignUpDTO();
		BeanUtils.copyProperties(entity, dto);
		log.info("Matching......" + passwordEncoder.matches(password, entity.getPassword()));
		// dto.setUserId(entity.getUserId());
		// dto.setPassword(entity.getPassword());

		if (entity.getLoginCount() >= 3) {
			System.out.println("running Login account condition");
			return null;
		}
		if (dto.getUserId().equals(userId) && passwordEncoder.matches(password, entity.getPassword())) {
			return dto;

		} else {
			this.repository.logincount(userId, entity.getLoginCount() + 1);
			log.info("count of login" + entity.getLoginCount() + 1);
			return null;
		}
	}

	@Override
	public List<SignUpDTO> findAll() {
		List<SignUpEntity> signUpEntity = this.repository.findAll();
		List<SignUpDTO> lists = new ArrayList<SignUpDTO>();
		for (SignUpEntity entity : signUpEntity) {
			SignUpDTO dto = new SignUpDTO();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);

		}
		return lists;
	}

	@Override
	public Long findByEmail(String email) {
		Long emailcount = this.repository.findByEmail(email);
		log.error("Find  by Email");
		return emailcount;
	}

	@Override
	public Long findByMobile(Long number) {
		Long mobilecount = this.repository.findByMobile(number);
		return mobilecount;
	}

	@Override
	public Long findByUser(String user) {
		Long usercount = this.repository.findByUser(user);
		return usercount;
	}

	@Override
	public boolean sendMail(String email) {
		String portNumber = "587"; // 485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "manjula104@outlook.com";
		String password = "manjula20";
		String to = email;

		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.sttartls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocal", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}

		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration  Completed");
			message.setText("Thanks for registration");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("Mail sent sucessfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}
}