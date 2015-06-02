package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolRating.
 * @see com.ptc.model.SchoolRating
 * @author Hibernate Tools
 */
@Stateless
public class SchoolRatingHome {

	private static final Log log = LogFactory.getLog(SchoolRatingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolRating transientInstance) {
		log.debug("persisting SchoolRating instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolRating persistentInstance) {
		log.debug("removing SchoolRating instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolRating merge(SchoolRating detachedInstance) {
		log.debug("merging SchoolRating instance");
		try {
			SchoolRating result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolRating findById(Integer id) {
		log.debug("getting SchoolRating instance with id: " + id);
		try {
			SchoolRating instance = entityManager.find(SchoolRating.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
