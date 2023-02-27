package com.xworkz.manju.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.manju.entity.PastriesEntity;

@Repository
public class PastriesRepositoryImpl implements RepositoryPastries {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public PastriesRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PastriesEntity entity) {
		System.out.println("Running save in repo..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();

		return true;
	}

	@Override
	public PastriesEntity findById(int id) {
		System.out.println("Find by id in repo.." + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		PastriesEntity entity = manager.find(PastriesEntity.class, id);
		manager.close();
		return entity;
	}

}
