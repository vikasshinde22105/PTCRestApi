package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ParentInfo.
 * @see com.ptc.model.ParentInfo
 * @author Hibernate Tools
 */
@Stateless
public class ParentInfoHome {

	private static final Log log = LogFactory.getLog(ParentInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ParentInfo transientInstance) {
		log.debug("persisting ParentInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ParentInfo persistentInstance) {
		log.debug("removing ParentInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ParentInfo merge(ParentInfo detachedInstance) {
		log.debug("merging ParentInfo instance");
		try {
			ParentInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ParentInfo findById(Integer id) {
		log.debug("getting ParentInfo instance with id: " + id);
		try {
			ParentInfo instance = entityManager.find(ParentInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
