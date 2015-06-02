package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserNotificationSettings.
 * @see com.ptc.model.UserNotificationSettings
 * @author Hibernate Tools
 */
@Stateless
public class UserNotificationSettingsHome {

	private static final Log log = LogFactory
			.getLog(UserNotificationSettingsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserNotificationSettings transientInstance) {
		log.debug("persisting UserNotificationSettings instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserNotificationSettings persistentInstance) {
		log.debug("removing UserNotificationSettings instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserNotificationSettings merge(
			UserNotificationSettings detachedInstance) {
		log.debug("merging UserNotificationSettings instance");
		try {
			UserNotificationSettings result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserNotificationSettings findById(Integer id) {
		log.debug("getting UserNotificationSettings instance with id: " + id);
		try {
			UserNotificationSettings instance = entityManager.find(
					UserNotificationSettings.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
