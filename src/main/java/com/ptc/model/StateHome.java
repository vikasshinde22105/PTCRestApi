package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class State.
 * @see com.ptc.model.State
 * @author Hibernate Tools
 */
@Stateless
public class StateHome {

	private static final Log log = LogFactory.getLog(StateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(State transientInstance) {
		log.debug("persisting State instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(State persistentInstance) {
		log.debug("removing State instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public State merge(State detachedInstance) {
		log.debug("merging State instance");
		try {
			State result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public State findById(Integer id) {
		log.debug("getting State instance with id: " + id);
		try {
			State instance = entityManager.find(State.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
