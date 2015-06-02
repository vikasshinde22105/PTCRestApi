package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserBus.
 * @see com.ptc.model.UserBus
 * @author Hibernate Tools
 */
@Stateless
public class UserBusHome {

	private static final Log log = LogFactory.getLog(UserBusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserBus transientInstance) {
		log.debug("persisting UserBus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserBus persistentInstance) {
		log.debug("removing UserBus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserBus merge(UserBus detachedInstance) {
		log.debug("merging UserBus instance");
		try {
			UserBus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserBus findById(Integer id) {
		log.debug("getting UserBus instance with id: " + id);
		try {
			UserBus instance = entityManager.find(UserBus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
