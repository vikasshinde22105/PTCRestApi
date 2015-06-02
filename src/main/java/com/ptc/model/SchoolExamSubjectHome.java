package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolExamSubject.
 * @see com.ptc.model.SchoolExamSubject
 * @author Hibernate Tools
 */
@Stateless
public class SchoolExamSubjectHome {

	private static final Log log = LogFactory
			.getLog(SchoolExamSubjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolExamSubject transientInstance) {
		log.debug("persisting SchoolExamSubject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolExamSubject persistentInstance) {
		log.debug("removing SchoolExamSubject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolExamSubject merge(SchoolExamSubject detachedInstance) {
		log.debug("merging SchoolExamSubject instance");
		try {
			SchoolExamSubject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolExamSubject findById(Integer id) {
		log.debug("getting SchoolExamSubject instance with id: " + id);
		try {
			SchoolExamSubject instance = entityManager.find(
					SchoolExamSubject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
