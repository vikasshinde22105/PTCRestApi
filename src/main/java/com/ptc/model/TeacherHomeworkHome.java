package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherHomework.
 * @see com.ptc.model.TeacherHomework
 * @author Hibernate Tools
 */
@Stateless
public class TeacherHomeworkHome {

	private static final Log log = LogFactory.getLog(TeacherHomeworkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherHomework transientInstance) {
		log.debug("persisting TeacherHomework instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherHomework persistentInstance) {
		log.debug("removing TeacherHomework instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherHomework merge(TeacherHomework detachedInstance) {
		log.debug("merging TeacherHomework instance");
		try {
			TeacherHomework result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherHomework findById(Integer id) {
		log.debug("getting TeacherHomework instance with id: " + id);
		try {
			TeacherHomework instance = entityManager.find(
					TeacherHomework.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
