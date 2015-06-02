package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolClassificationType.
 * @see com.ptc.model.SchoolClassificationType
 * @author Hibernate Tools
 */
@Stateless
public class SchoolClassificationTypeHome {

	private static final Log log = LogFactory
			.getLog(SchoolClassificationTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolClassificationType transientInstance) {
		log.debug("persisting SchoolClassificationType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolClassificationType persistentInstance) {
		log.debug("removing SchoolClassificationType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolClassificationType merge(
			SchoolClassificationType detachedInstance) {
		log.debug("merging SchoolClassificationType instance");
		try {
			SchoolClassificationType result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolClassificationType findById(Short id) {
		log.debug("getting SchoolClassificationType instance with id: " + id);
		try {
			SchoolClassificationType instance = entityManager.find(
					SchoolClassificationType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
