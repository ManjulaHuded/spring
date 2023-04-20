package com.xworkz.signup.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.signup.dto.SignUpDTO;

public interface SignUpService {

	Set<ConstraintViolation<SignUpDTO>> validateAndSave(SignUpDTO signUpDTO);

	default SignUpDTO findByUserIdAndPassword(String userId, String password) {
		return null;
	}

	default List<SignUpDTO> findAll() {
		return Collections.emptyList();
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

	boolean sendMail(String email);

	default SignUpDTO reSetPassword(String email) {
		return null;
	}

	default SignUpDTO updatePassword(String userId, String password, String confirmPassword) {
		return null;
	}

}
