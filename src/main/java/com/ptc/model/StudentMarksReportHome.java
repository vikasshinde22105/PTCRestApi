package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentMarksReport.
 * @see com.ptc.model.StudentMarksReport
 * @author Hibernate Tools
 */
@Stateless
public class StudentMarksReportHome {

	private static final Log log = LogFactory
			.getLog(StudentMarksReportHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentMarksReport transientInstance) {
		log.debug("persisting StudentMarksReport instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentMarksReport persistentInstance) {
		log.debug("removing StudentMarksReport instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentMarksReport merge(StudentMarksReport detachedInstance) {
		log.debug("merging StudentMarksReport instance");
		try {
			StudentMarksReport result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentMarksReport findById(Integer id) {
		log.debug("getting StudentMarksReport instance with id: " + id);
		try {
			StudentMarksReport instance = entityManager.find(
					StudentMarksReport.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
