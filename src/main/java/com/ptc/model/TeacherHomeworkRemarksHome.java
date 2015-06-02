package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherHomeworkRemarks.
 * @see com.ptc.model.TeacherHomeworkRemarks
 * @author Hibernate Tools
 */
@Stateless
public class TeacherHomeworkRemarksHome {

	private static final Log log = LogFactory
			.getLog(TeacherHomeworkRemarksHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherHomeworkRemarks transientInstance) {
		log.debug("persisting TeacherHomeworkRemarks instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherHomeworkRemarks persistentInstance) {
		log.debug("removing TeacherHomeworkRemarks instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherHomeworkRemarks merge(TeacherHomeworkRemarks detachedInstance) {
		log.debug("merging TeacherHomeworkRemarks instance");
		try {
			TeacherHomeworkRemarks result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherHomeworkRemarks findById(Integer id) {
		log.debug("getting TeacherHomeworkRemarks instance with id: " + id);
		try {
			TeacherHomeworkRemarks instance = entityManager.find(
					TeacherHomeworkRemarks.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
