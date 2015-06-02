package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentPersonalInfo.
 * @see com.ptc.model.StudentPersonalInfo
 * @author Hibernate Tools
 */
@Stateless
public class StudentPersonalInfoHome {

	private static final Log log = LogFactory
			.getLog(StudentPersonalInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentPersonalInfo transientInstance) {
		log.debug("persisting StudentPersonalInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentPersonalInfo persistentInstance) {
		log.debug("removing StudentPersonalInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentPersonalInfo merge(StudentPersonalInfo detachedInstance) {
		log.debug("merging StudentPersonalInfo instance");
		try {
			StudentPersonalInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentPersonalInfo findById(Integer id) {
		log.debug("getting StudentPersonalInfo instance with id: " + id);
		try {
			StudentPersonalInfo instance = entityManager.find(
					StudentPersonalInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
