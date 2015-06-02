package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tehsil.
 * @see com.ptc.model.Tehsil
 * @author Hibernate Tools
 */
@Stateless
public class TehsilHome {

	private static final Log log = LogFactory.getLog(TehsilHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tehsil transientInstance) {
		log.debug("persisting Tehsil instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tehsil persistentInstance) {
		log.debug("removing Tehsil instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tehsil merge(Tehsil detachedInstance) {
		log.debug("merging Tehsil instance");
		try {
			Tehsil result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tehsil findById(Integer id) {
		log.debug("getting Tehsil instance with id: " + id);
		try {
			Tehsil instance = entityManager.find(Tehsil.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
