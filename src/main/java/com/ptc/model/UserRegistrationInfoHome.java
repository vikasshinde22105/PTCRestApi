package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserRegistrationInfo.
 * @see com.ptc.model.UserRegistrationInfo
 * @author Hibernate Tools
 */
@Stateless
public class UserRegistrationInfoHome {

	private static final Log log = LogFactory
			.getLog(UserRegistrationInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserRegistrationInfo transientInstance) {
		log.debug("persisting UserRegistrationInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserRegistrationInfo persistentInstance) {
		log.debug("removing UserRegistrationInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserRegistrationInfo merge(UserRegistrationInfo detachedInstance) {
		log.debug("merging UserRegistrationInfo instance");
		try {
			UserRegistrationInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserRegistrationInfo findById(Integer id) {
		log.debug("getting UserRegistrationInfo instance with id: " + id);
		try {
			UserRegistrationInfo instance = entityManager.find(
					UserRegistrationInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
