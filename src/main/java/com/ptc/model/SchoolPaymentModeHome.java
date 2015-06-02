package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolPaymentMode.
 * @see com.ptc.model.SchoolPaymentMode
 * @author Hibernate Tools
 */
@Stateless
public class SchoolPaymentModeHome {

	private static final Log log = LogFactory
			.getLog(SchoolPaymentModeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolPaymentMode transientInstance) {
		log.debug("persisting SchoolPaymentMode instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolPaymentMode persistentInstance) {
		log.debug("removing SchoolPaymentMode instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolPaymentMode merge(SchoolPaymentMode detachedInstance) {
		log.debug("merging SchoolPaymentMode instance");
		try {
			SchoolPaymentMode result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolPaymentMode findById(Integer id) {
		log.debug("getting SchoolPaymentMode instance with id: " + id);
		try {
			SchoolPaymentMode instance = entityManager.find(
					SchoolPaymentMode.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
