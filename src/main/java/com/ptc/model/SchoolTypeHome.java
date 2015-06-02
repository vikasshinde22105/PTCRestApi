package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolType.
 * @see com.ptc.model.SchoolType
 * @author Hibernate Tools
 */
@Stateless
public class SchoolTypeHome {

	private static final Log log = LogFactory.getLog(SchoolTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolType transientInstance) {
		log.debug("persisting SchoolType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolType persistentInstance) {
		log.debug("removing SchoolType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolType merge(SchoolType detachedInstance) {
		log.debug("merging SchoolType instance");
		try {
			SchoolType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolType findById(Short id) {
		log.debug("getting SchoolType instance with id: " + id);
		try {
			SchoolType instance = entityManager.find(SchoolType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
