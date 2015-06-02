package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolEmergencyContact.
 * @see com.ptc.model.SchoolEmergencyContact
 * @author Hibernate Tools
 */
@Stateless
public class SchoolEmergencyContactHome {

	private static final Log log = LogFactory
			.getLog(SchoolEmergencyContactHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolEmergencyContact transientInstance) {
		log.debug("persisting SchoolEmergencyContact instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolEmergencyContact persistentInstance) {
		log.debug("removing SchoolEmergencyContact instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolEmergencyContact merge(SchoolEmergencyContact detachedInstance) {
		log.debug("merging SchoolEmergencyContact instance");
		try {
			SchoolEmergencyContact result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolEmergencyContact findById(Integer id) {
		log.debug("getting SchoolEmergencyContact instance with id: " + id);
		try {
			SchoolEmergencyContact instance = entityManager.find(
					SchoolEmergencyContact.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
