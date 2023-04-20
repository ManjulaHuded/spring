package com.xworkz.signup.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.signup.entity.SignUpEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SignUpRepositoryImpl implements SignUpRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public SignUpRepositoryImpl() {
		log.info("Created" + getClass().getSimpleName());
	}

	@Override
	public boolean save(SignUpEntity entity) {
		log.info("Running save in repoImpl " + entity);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
			entityManager.close();
			return true;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public SignUpEntity findByUserId(String userId) {
		log.info("Running findByUserId method in repo" + userId);
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByUserIdAndPassword");
			query.setParameter("userIdBy", userId);
			Object object = query.getSingleResult();
			SignUpEntity entity = (SignUpEntity) object;
			log.info("" + entity);
			return entity;
		} finally {
			em.close();
		}

	}

	@Override
	public List<SignUpEntity> findAll() {
		log.info("Running findAll method in repo");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findAllEntity");
			List<SignUpEntity> list = query.getResultList();
			log.info("Total list size found in repo" + list.size());
			return list;
		} finally {
			em.close();
		}
	}

	@Override
	public Long findByEmail(String email) {
		log.info("Running findByEmail method in repo" + email);
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByEmailId");
			query.setParameter("emailBy", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}

	}

	@Override
	public Long findByUser(String user) {
		log.info("Running findAll method in repo" + user);
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByuserId");
			query.setParameter("userBy", user);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}
	}

	@Override
	public Long findByMobile(Long number) {
		log.info("Running findByMobile method in repo" + number);
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByMobileId");
			query.setParameter("mobileBy", number);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}
	}

	@Override
	public boolean logincount(String userId, int count) {
		log.info("count : " + count);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = entityManager.getTransaction();
			et.begin();
			Query query = entityManager.createNamedQuery("findByUpdateLoginCount");
			query.setParameter("userId", userId);
			query.setParameter("count", count);
			query.executeUpdate();
			et.commit();
			return true;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public SignUpEntity reSetPassword(String email) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("emailid");
			query.setParameter("ei", email);
			Object object = query.getSingleResult();
			SignUpEntity entity = (SignUpEntity) object;
			log.info("" + entity);
			return entity;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean update(SignUpEntity userEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(userEntity);
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean updatePassword(String userId, String password, Boolean resetPassword) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			Query query = em.createNamedQuery("updatePassword");
			query.setParameter("byUserId", userId);
			query.setParameter("byPassword", password);
			query.setParameter("byResetPassword", resetPassword);
			query.executeUpdate();
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

}
