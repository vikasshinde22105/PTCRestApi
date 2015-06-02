package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TimeTable.
 * @see com.ptc.model.TimeTable
 * @author Hibernate Tools
 */
@Stateless
public class TimeTableHome {

	private static final Log log = LogFactory.getLog(TimeTableHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TimeTable transientInstance) {
		log.debug("persisting TimeTable instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TimeTable persistentInstance) {
		log.debug("removing TimeTable instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TimeTable merge(TimeTable detachedInstance) {
		log.debug("merging TimeTable instance");
		try {
			TimeTable result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TimeTable findById(Integer id) {
		log.debug("getting TimeTable instance with id: " + id);
		try {
			TimeTable instance = entityManager.find(TimeTable.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
