package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolTeacher.
 * @see com.ptc.model.SchoolTeacher
 * @author Hibernate Tools
 */
@Stateless
public class SchoolTeacherHome {

	private static final Log log = LogFactory.getLog(SchoolTeacherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolTeacher transientInstance) {
		log.debug("persisting SchoolTeacher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolTeacher persistentInstance) {
		log.debug("removing SchoolTeacher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolTeacher merge(SchoolTeacher detachedInstance) {
		log.debug("merging SchoolTeacher instance");
		try {
			SchoolTeacher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolTeacher findById(Integer id) {
		log.debug("getting SchoolTeacher instance with id: " + id);
		try {
			SchoolTeacher instance = entityManager
					.find(SchoolTeacher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
