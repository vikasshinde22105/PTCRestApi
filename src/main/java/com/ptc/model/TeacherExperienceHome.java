package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherExperience.
 * @see com.ptc.model.TeacherExperience
 * @author Hibernate Tools
 */
@Stateless
public class TeacherExperienceHome {

	private static final Log log = LogFactory
			.getLog(TeacherExperienceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherExperience transientInstance) {
		log.debug("persisting TeacherExperience instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherExperience persistentInstance) {
		log.debug("removing TeacherExperience instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherExperience merge(TeacherExperience detachedInstance) {
		log.debug("merging TeacherExperience instance");
		try {
			TeacherExperience result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherExperience findById(Integer id) {
		log.debug("getting TeacherExperience instance with id: " + id);
		try {
			TeacherExperience instance = entityManager.find(
					TeacherExperience.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
