package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherSubject.
 * @see com.ptc.model.TeacherSubject
 * @author Hibernate Tools
 */
@Stateless
public class TeacherSubjectHome {

	private static final Log log = LogFactory.getLog(TeacherSubjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherSubject transientInstance) {
		log.debug("persisting TeacherSubject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherSubject persistentInstance) {
		log.debug("removing TeacherSubject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherSubject merge(TeacherSubject detachedInstance) {
		log.debug("merging TeacherSubject instance");
		try {
			TeacherSubject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherSubject findById(Integer id) {
		log.debug("getting TeacherSubject instance with id: " + id);
		try {
			TeacherSubject instance = entityManager.find(TeacherSubject.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
