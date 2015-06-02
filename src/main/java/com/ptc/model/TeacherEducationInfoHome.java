package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherEducationInfo.
 * @see com.ptc.model.TeacherEducationInfo
 * @author Hibernate Tools
 */
@Stateless
public class TeacherEducationInfoHome {

	private static final Log log = LogFactory
			.getLog(TeacherEducationInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherEducationInfo transientInstance) {
		log.debug("persisting TeacherEducationInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherEducationInfo persistentInstance) {
		log.debug("removing TeacherEducationInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherEducationInfo merge(TeacherEducationInfo detachedInstance) {
		log.debug("merging TeacherEducationInfo instance");
		try {
			TeacherEducationInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherEducationInfo findById(Integer id) {
		log.debug("getting TeacherEducationInfo instance with id: " + id);
		try {
			TeacherEducationInfo instance = entityManager.find(
					TeacherEducationInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
