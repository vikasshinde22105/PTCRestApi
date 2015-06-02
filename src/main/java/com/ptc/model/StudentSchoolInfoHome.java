package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentSchoolInfo.
 * @see com.ptc.model.StudentSchoolInfo
 * @author Hibernate Tools
 */
@Stateless
public class StudentSchoolInfoHome {

	private static final Log log = LogFactory
			.getLog(StudentSchoolInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentSchoolInfo transientInstance) {
		log.debug("persisting StudentSchoolInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentSchoolInfo persistentInstance) {
		log.debug("removing StudentSchoolInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentSchoolInfo merge(StudentSchoolInfo detachedInstance) {
		log.debug("merging StudentSchoolInfo instance");
		try {
			StudentSchoolInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentSchoolInfo findById(Integer id) {
		log.debug("getting StudentSchoolInfo instance with id: " + id);
		try {
			StudentSchoolInfo instance = entityManager.find(
					StudentSchoolInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
