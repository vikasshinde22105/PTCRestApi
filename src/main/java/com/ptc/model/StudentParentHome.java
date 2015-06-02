package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentParent.
 * @see com.ptc.model.StudentParent
 * @author Hibernate Tools
 */
@Stateless
public class StudentParentHome {

	private static final Log log = LogFactory.getLog(StudentParentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentParent transientInstance) {
		log.debug("persisting StudentParent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentParent persistentInstance) {
		log.debug("removing StudentParent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentParent merge(StudentParent detachedInstance) {
		log.debug("merging StudentParent instance");
		try {
			StudentParent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentParent findById(Integer id) {
		log.debug("getting StudentParent instance with id: " + id);
		try {
			StudentParent instance = entityManager
					.find(StudentParent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
