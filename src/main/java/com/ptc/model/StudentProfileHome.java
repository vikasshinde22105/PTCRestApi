package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentProfile.
 * @see com.ptc.model.StudentProfile
 * @author Hibernate Tools
 */
@Stateless
public class StudentProfileHome {

	private static final Log log = LogFactory.getLog(StudentProfileHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentProfile transientInstance) {
		log.debug("persisting StudentProfile instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentProfile persistentInstance) {
		log.debug("removing StudentProfile instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentProfile merge(StudentProfile detachedInstance) {
		log.debug("merging StudentProfile instance");
		try {
			StudentProfile result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentProfile findById(Integer id) {
		log.debug("getting StudentProfile instance with id: " + id);
		try {
			StudentProfile instance = entityManager.find(StudentProfile.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
