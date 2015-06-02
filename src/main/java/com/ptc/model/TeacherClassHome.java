package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherClass.
 * @see com.ptc.model.TeacherClass
 * @author Hibernate Tools
 */
@Stateless
public class TeacherClassHome {

	private static final Log log = LogFactory.getLog(TeacherClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherClass transientInstance) {
		log.debug("persisting TeacherClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherClass persistentInstance) {
		log.debug("removing TeacherClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherClass merge(TeacherClass detachedInstance) {
		log.debug("merging TeacherClass instance");
		try {
			TeacherClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherClass findById(Integer id) {
		log.debug("getting TeacherClass instance with id: " + id);
		try {
			TeacherClass instance = entityManager.find(TeacherClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
