package com.xworkz.manju.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.manju.entity.PastriesEntity;

@Repository
public class PastriesRepositoryImpl implements PastriesRepository {

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

	@Override
	public List<PastriesEntity> findByColor(String color) {
		System.out.println("Running findByColor in repoo " + color);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByColor");
			query.setParameter("col", color);
			List<PastriesEntity> list = query.getResultList();
			System.out.println("Total list found in repo.." + list.size());
			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(PastriesEntity entity) {
		System.out.println("Running update method in repo..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {

			manager.close();
		}
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running delete in repo..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			PastriesEntity entity = manager.find(PastriesEntity.class, id);
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

}
