package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolInfo.
 * @see com.ptc.model.SchoolInfo
 * @author Hibernate Tools
 */
@Stateless
public class SchoolInfoHome {

	private static final Log log = LogFactory.getLog(SchoolInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolInfo transientInstance) {
		log.debug("persisting SchoolInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolInfo persistentInstance) {
		log.debug("removing SchoolInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolInfo merge(SchoolInfo detachedInstance) {
		log.debug("merging SchoolInfo instance");
		try {
			SchoolInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolInfo findById(Integer id) {
		log.debug("getting SchoolInfo instance with id: " + id);
		try {
			SchoolInfo instance = entityManager.find(SchoolInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
