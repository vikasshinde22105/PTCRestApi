package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserLeaveBalance.
 * @see com.ptc.model.UserLeaveBalance
 * @author Hibernate Tools
 */
@Stateless
public class UserLeaveBalanceHome {

	private static final Log log = LogFactory
			.getLog(UserLeaveBalanceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserLeaveBalance transientInstance) {
		log.debug("persisting UserLeaveBalance instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserLeaveBalance persistentInstance) {
		log.debug("removing UserLeaveBalance instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserLeaveBalance merge(UserLeaveBalance detachedInstance) {
		log.debug("merging UserLeaveBalance instance");
		try {
			UserLeaveBalance result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserLeaveBalance findById(Integer id) {
		log.debug("getting UserLeaveBalance instance with id: " + id);
		try {
			UserLeaveBalance instance = entityManager.find(
					UserLeaveBalance.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
