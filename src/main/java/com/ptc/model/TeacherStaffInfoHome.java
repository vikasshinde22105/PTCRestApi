package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherStaffInfo.
 * @see com.ptc.model.TeacherStaffInfo
 * @author Hibernate Tools
 */
@Stateless
public class TeacherStaffInfoHome {

	private static final Log log = LogFactory
			.getLog(TeacherStaffInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherStaffInfo transientInstance) {
		log.debug("persisting TeacherStaffInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherStaffInfo persistentInstance) {
		log.debug("removing TeacherStaffInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherStaffInfo merge(TeacherStaffInfo detachedInstance) {
		log.debug("merging TeacherStaffInfo instance");
		try {
			TeacherStaffInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherStaffInfo findById(Integer id) {
		log.debug("getting TeacherStaffInfo instance with id: " + id);
		try {
			TeacherStaffInfo instance = entityManager.find(
					TeacherStaffInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
