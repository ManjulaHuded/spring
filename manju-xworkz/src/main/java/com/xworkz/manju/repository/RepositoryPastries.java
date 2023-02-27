package com.xworkz.manju.repository;

import com.xworkz.manju.entity.PastriesEntity;

public interface RepositoryPastries {

	boolean save(PastriesEntity entity);

	default PastriesEntity findById(int id) {
		return null;
	}

}
