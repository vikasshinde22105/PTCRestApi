package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserRating.
 * @see com.ptc.model.UserRating
 * @author Hibernate Tools
 */
@Stateless
public class UserRatingHome {

	private static final Log log = LogFactory.getLog(UserRatingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserRating transientInstance) {
		log.debug("persisting UserRating instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserRating persistentInstance) {
		log.debug("removing UserRating instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserRating merge(UserRating detachedInstance) {
		log.debug("merging UserRating instance");
		try {
			UserRating result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserRating findById(Integer id) {
		log.debug("getting UserRating instance with id: " + id);
		try {
			UserRating instance = entityManager.find(UserRating.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
