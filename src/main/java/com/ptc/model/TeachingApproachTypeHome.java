package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeachingApproachType.
 * @see com.ptc.model.TeachingApproachType
 * @author Hibernate Tools
 */
@Stateless
public class TeachingApproachTypeHome {

	private static final Log log = LogFactory
			.getLog(TeachingApproachTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeachingApproachType transientInstance) {
		log.debug("persisting TeachingApproachType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeachingApproachType persistentInstance) {
		log.debug("removing TeachingApproachType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeachingApproachType merge(TeachingApproachType detachedInstance) {
		log.debug("merging TeachingApproachType instance");
		try {
			TeachingApproachType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeachingApproachType findById(Short id) {
		log.debug("getting TeachingApproachType instance with id: " + id);
		try {
			TeachingApproachType instance = entityManager.find(
					TeachingApproachType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
