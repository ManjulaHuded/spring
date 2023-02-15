package com.xworkz.egg.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;

@Repository
public class RepositryEggApplicationImpl implements RepositryEggApplication {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public RepositryEggApplicationImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
		System.out.println("save..");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}
