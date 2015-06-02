package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StandardType.
 * @see com.ptc.model.StandardType
 * @author Hibernate Tools
 */
@Stateless
public class StandardTypeHome {

	private static final Log log = LogFactory.getLog(StandardTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StandardType transientInstance) {
		log.debug("persisting StandardType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StandardType persistentInstance) {
		log.debug("removing StandardType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StandardType merge(StandardType detachedInstance) {
		log.debug("merging StandardType instance");
		try {
			StandardType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StandardType findById(Short id) {
		log.debug("getting StandardType instance with id: " + id);
		try {
			StandardType instance = entityManager.find(StandardType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
