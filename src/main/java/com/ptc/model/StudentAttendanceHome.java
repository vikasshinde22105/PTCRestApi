package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentAttendance.
 * @see com.ptc.model.StudentAttendance
 * @author Hibernate Tools
 */
@Stateless
public class StudentAttendanceHome {

	private static final Log log = LogFactory
			.getLog(StudentAttendanceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentAttendance transientInstance) {
		log.debug("persisting StudentAttendance instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentAttendance persistentInstance) {
		log.debug("removing StudentAttendance instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentAttendance merge(StudentAttendance detachedInstance) {
		log.debug("merging StudentAttendance instance");
		try {
			StudentAttendance result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentAttendance findById(Integer id) {
		log.debug("getting StudentAttendance instance with id: " + id);
		try {
			StudentAttendance instance = entityManager.find(
					StudentAttendance.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
