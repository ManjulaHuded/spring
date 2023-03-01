package com.xworkz.manju.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.manju.entity.PastriesEntity;

public interface PastriesRepository {

	boolean save(PastriesEntity entity);
	boolean update(PastriesEntity entity);

	default PastriesEntity findById(int id) {
		return null;
	}

	default List<PastriesEntity> findByColor(String color) {
		return Collections.emptyList();
	}
	
	

}
