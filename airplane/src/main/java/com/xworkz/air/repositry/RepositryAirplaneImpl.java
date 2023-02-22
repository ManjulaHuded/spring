package com.xworkz.air.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.air.entity.AirplaneEntity;

@Repository
public class RepositryAirplaneImpl implements RepositryAirplane {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public RepositryAirplaneImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AirplaneEntity entity) {
		System.out.println("Running save in repo.. ");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public AirplaneEntity findById(int id) {
		System.out.println("Find by id in repo.." + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		AirplaneEntity airplaneEntity = manager.find(AirplaneEntity.class, id);
		manager.close();
		return airplaneEntity;
	}

}
