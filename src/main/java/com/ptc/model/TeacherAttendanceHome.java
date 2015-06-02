package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherAttendance.
 * @see com.ptc.model.TeacherAttendance
 * @author Hibernate Tools
 */
@Stateless
public class TeacherAttendanceHome {

	private static final Log log = LogFactory
			.getLog(TeacherAttendanceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherAttendance transientInstance) {
		log.debug("persisting TeacherAttendance instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherAttendance persistentInstance) {
		log.debug("removing TeacherAttendance instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherAttendance merge(TeacherAttendance detachedInstance) {
		log.debug("merging TeacherAttendance instance");
		try {
			TeacherAttendance result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherAttendance findById(Integer id) {
		log.debug("getting TeacherAttendance instance with id: " + id);
		try {
			TeacherAttendance instance = entityManager.find(
					TeacherAttendance.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
