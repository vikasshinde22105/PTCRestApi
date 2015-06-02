package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserLeave.
 * @see com.ptc.model.UserLeave
 * @author Hibernate Tools
 */
@Stateless
public class UserLeaveHome {

	private static final Log log = LogFactory.getLog(UserLeaveHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserLeave transientInstance) {
		log.debug("persisting UserLeave instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserLeave persistentInstance) {
		log.debug("removing UserLeave instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserLeave merge(UserLeave detachedInstance) {
		log.debug("merging UserLeave instance");
		try {
			UserLeave result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserLeave findById(Integer id) {
		log.debug("getting UserLeave instance with id: " + id);
		try {
			UserLeave instance = entityManager.find(UserLeave.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
