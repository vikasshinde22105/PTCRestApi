package com.ptc.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolEducationAchievement.
 * @see com.ptc.model.SchoolEducationAchievement
 * @author Hibernate Tools
 */
@Stateless
public class SchoolEducationAchievementHome {

	private static final Log log = LogFactory
			.getLog(SchoolEducationAchievementHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolEducationAchievement transientInstance) {
		log.debug("persisting SchoolEducationAchievement instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolEducationAchievement persistentInstance) {
		log.debug("removing SchoolEducationAchievement instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolEducationAchievement merge(
			SchoolEducationAchievement detachedInstance) {
		log.debug("merging SchoolEducationAchievement instance");
		try {
			SchoolEducationAchievement result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolEducationAchievement findById(Integer id) {
		log.debug("getting SchoolEducationAchievement instance with id: " + id);
		try {
			SchoolEducationAchievement instance = entityManager.find(
					SchoolEducationAchievement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
