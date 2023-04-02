package com.xworkz.signup.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.entity.SignUpEntity;
import com.xworkz.signup.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	private SignUpRepository repository;
	
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
					BeanUtils.copyProperties(signUpDTO, entity);
					boolean saved = this.repository.save(entity);
					//boolean sent = this.sendMail(signUpDTO.getEmail());
					log.info("Saved in Entity-" + saved);
					//log.info("Email sent -:" + sent);

				}
			} else {
				log.error("Password must be same");
			}
		} else {
			log.error("User already exsist");
		}
		return Collections.emptySet();
	}
	
}
