package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolBoard.
 * @see com.ptc.model.SchoolBoard
 * @author Hibernate Tools
 */
@Stateless
public class SchoolBoardHome {

	private static final Log log = LogFactory.getLog(SchoolBoardHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolBoard transientInstance) {
		log.debug("persisting SchoolBoard instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolBoard persistentInstance) {
		log.debug("removing SchoolBoard instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolBoard merge(SchoolBoard detachedInstance) {
		log.debug("merging SchoolBoard instance");
		try {
			SchoolBoard result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolBoard findById(Integer id) {
		log.debug("getting SchoolBoard instance with id: " + id);
		try {
			SchoolBoard instance = entityManager.find(SchoolBoard.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
