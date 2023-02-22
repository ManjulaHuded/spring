package com.xworkz.air.repositry;

import com.xworkz.air.entity.AirplaneEntity;

public interface RepositryAirplane {

	boolean save(AirplaneEntity entity);

	default AirplaneEntity findById(int id) {
		return null;
	}

}
