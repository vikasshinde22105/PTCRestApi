package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SecondaryRole.
 * @see com.ptc.model.SecondaryRole
 * @author Hibernate Tools
 */
@Stateless
public class SecondaryRoleHome {

	private static final Log log = LogFactory.getLog(SecondaryRoleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SecondaryRole transientInstance) {
		log.debug("persisting SecondaryRole instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SecondaryRole persistentInstance) {
		log.debug("removing SecondaryRole instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SecondaryRole merge(SecondaryRole detachedInstance) {
		log.debug("merging SecondaryRole instance");
		try {
			SecondaryRole result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SecondaryRole findById(Short id) {
		log.debug("getting SecondaryRole instance with id: " + id);
		try {
			SecondaryRole instance = entityManager
					.find(SecondaryRole.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
