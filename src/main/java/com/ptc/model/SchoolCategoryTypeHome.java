package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolCategoryType.
 * @see com.ptc.model.SchoolCategoryType
 * @author Hibernate Tools
 */
@Stateless
public class SchoolCategoryTypeHome {

	private static final Log log = LogFactory
			.getLog(SchoolCategoryTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolCategoryType transientInstance) {
		log.debug("persisting SchoolCategoryType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolCategoryType persistentInstance) {
		log.debug("removing SchoolCategoryType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolCategoryType merge(SchoolCategoryType detachedInstance) {
		log.debug("merging SchoolCategoryType instance");
		try {
			SchoolCategoryType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolCategoryType findById(Short id) {
		log.debug("getting SchoolCategoryType instance with id: " + id);
		try {
			SchoolCategoryType instance = entityManager.find(
					SchoolCategoryType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
