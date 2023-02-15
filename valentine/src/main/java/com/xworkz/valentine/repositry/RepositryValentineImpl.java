package com.xworkz.valentine.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.EntityValentine;


@Repository
public class RepositryValentineImpl implements RepositryValentine {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public RepositryValentineImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EntityValentine entity) {
		System.out.println("Running save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

	


}
