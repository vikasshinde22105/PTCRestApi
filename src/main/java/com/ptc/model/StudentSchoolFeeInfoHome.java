package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentSchoolFeeInfo.
 * @see com.ptc.model.StudentSchoolFeeInfo
 * @author Hibernate Tools
 */
@Stateless
public class StudentSchoolFeeInfoHome {

	private static final Log log = LogFactory
			.getLog(StudentSchoolFeeInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentSchoolFeeInfo transientInstance) {
		log.debug("persisting StudentSchoolFeeInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentSchoolFeeInfo persistentInstance) {
		log.debug("removing StudentSchoolFeeInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentSchoolFeeInfo merge(StudentSchoolFeeInfo detachedInstance) {
		log.debug("merging StudentSchoolFeeInfo instance");
		try {
			StudentSchoolFeeInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentSchoolFeeInfo findById(StudentSchoolFeeInfoId id) {
		log.debug("getting StudentSchoolFeeInfo instance with id: " + id);
		try {
			StudentSchoolFeeInfo instance = entityManager.find(
					StudentSchoolFeeInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
