package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherTimeTable.
 * @see com.ptc.model.TeacherTimeTable
 * @author Hibernate Tools
 */
@Stateless
public class TeacherTimeTableHome {

	private static final Log log = LogFactory
			.getLog(TeacherTimeTableHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherTimeTable transientInstance) {
		log.debug("persisting TeacherTimeTable instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherTimeTable persistentInstance) {
		log.debug("removing TeacherTimeTable instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherTimeTable merge(TeacherTimeTable detachedInstance) {
		log.debug("merging TeacherTimeTable instance");
		try {
			TeacherTimeTable result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherTimeTable findById(Integer id) {
		log.debug("getting TeacherTimeTable instance with id: " + id);
		try {
			TeacherTimeTable instance = entityManager.find(
					TeacherTimeTable.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
