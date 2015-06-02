package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolMedium.
 * @see com.ptc.model.SchoolMedium
 * @author Hibernate Tools
 */
@Stateless
public class SchoolMediumHome {

	private static final Log log = LogFactory.getLog(SchoolMediumHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolMedium transientInstance) {
		log.debug("persisting SchoolMedium instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolMedium persistentInstance) {
		log.debug("removing SchoolMedium instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolMedium merge(SchoolMedium detachedInstance) {
		log.debug("merging SchoolMedium instance");
		try {
			SchoolMedium result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolMedium findById(Integer id) {
		log.debug("getting SchoolMedium instance with id: " + id);
		try {
			SchoolMedium instance = entityManager.find(SchoolMedium.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
