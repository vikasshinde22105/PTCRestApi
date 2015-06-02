package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolFeeDetail.
 * @see com.ptc.model.SchoolFeeDetail
 * @author Hibernate Tools
 */
@Stateless
public class SchoolFeeDetailHome {

	private static final Log log = LogFactory.getLog(SchoolFeeDetailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolFeeDetail transientInstance) {
		log.debug("persisting SchoolFeeDetail instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolFeeDetail persistentInstance) {
		log.debug("removing SchoolFeeDetail instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolFeeDetail merge(SchoolFeeDetail detachedInstance) {
		log.debug("merging SchoolFeeDetail instance");
		try {
			SchoolFeeDetail result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolFeeDetail findById(Integer id) {
		log.debug("getting SchoolFeeDetail instance with id: " + id);
		try {
			SchoolFeeDetail instance = entityManager.find(
					SchoolFeeDetail.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
