package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentPrevSchoolDetail.
 * @see com.ptc.model.StudentPrevSchoolDetail
 * @author Hibernate Tools
 */
@Stateless
public class StudentPrevSchoolDetailHome {

	private static final Log log = LogFactory
			.getLog(StudentPrevSchoolDetailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentPrevSchoolDetail transientInstance) {
		log.debug("persisting StudentPrevSchoolDetail instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentPrevSchoolDetail persistentInstance) {
		log.debug("removing StudentPrevSchoolDetail instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentPrevSchoolDetail merge(
			StudentPrevSchoolDetail detachedInstance) {
		log.debug("merging StudentPrevSchoolDetail instance");
		try {
			StudentPrevSchoolDetail result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentPrevSchoolDetail findById(Integer id) {
		log.debug("getting StudentPrevSchoolDetail instance with id: " + id);
		try {
			StudentPrevSchoolDetail instance = entityManager.find(
					StudentPrevSchoolDetail.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
