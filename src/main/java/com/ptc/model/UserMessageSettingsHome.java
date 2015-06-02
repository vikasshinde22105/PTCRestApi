package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserMessageSettings.
 * @see com.ptc.model.UserMessageSettings
 * @author Hibernate Tools
 */
@Stateless
public class UserMessageSettingsHome {

	private static final Log log = LogFactory
			.getLog(UserMessageSettingsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserMessageSettings transientInstance) {
		log.debug("persisting UserMessageSettings instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserMessageSettings persistentInstance) {
		log.debug("removing UserMessageSettings instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserMessageSettings merge(UserMessageSettings detachedInstance) {
		log.debug("merging UserMessageSettings instance");
		try {
			UserMessageSettings result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserMessageSettings findById(Integer id) {
		log.debug("getting UserMessageSettings instance with id: " + id);
		try {
			UserMessageSettings instance = entityManager.find(
					UserMessageSettings.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
