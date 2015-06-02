package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolBankAccountDetails.
 * @see com.ptc.model.SchoolBankAccountDetails
 * @author Hibernate Tools
 */
@Stateless
public class SchoolBankAccountDetailsHome {

	private static final Log log = LogFactory
			.getLog(SchoolBankAccountDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolBankAccountDetails transientInstance) {
		log.debug("persisting SchoolBankAccountDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolBankAccountDetails persistentInstance) {
		log.debug("removing SchoolBankAccountDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolBankAccountDetails merge(
			SchoolBankAccountDetails detachedInstance) {
		log.debug("merging SchoolBankAccountDetails instance");
		try {
			SchoolBankAccountDetails result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolBankAccountDetails findById(Integer id) {
		log.debug("getting SchoolBankAccountDetails instance with id: " + id);
		try {
			SchoolBankAccountDetails instance = entityManager.find(
					SchoolBankAccountDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
