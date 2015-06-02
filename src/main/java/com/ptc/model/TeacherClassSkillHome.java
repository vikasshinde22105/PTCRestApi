package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherClassSkill.
 * @see com.ptc.model.TeacherClassSkill
 * @author Hibernate Tools
 */
@Stateless
public class TeacherClassSkillHome {

	private static final Log log = LogFactory
			.getLog(TeacherClassSkillHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherClassSkill transientInstance) {
		log.debug("persisting TeacherClassSkill instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherClassSkill persistentInstance) {
		log.debug("removing TeacherClassSkill instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherClassSkill merge(TeacherClassSkill detachedInstance) {
		log.debug("merging TeacherClassSkill instance");
		try {
			TeacherClassSkill result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherClassSkill findById(Integer id) {
		log.debug("getting TeacherClassSkill instance with id: " + id);
		try {
			TeacherClassSkill instance = entityManager.find(
					TeacherClassSkill.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
