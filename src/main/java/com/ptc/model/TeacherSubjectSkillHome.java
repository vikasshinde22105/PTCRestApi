package com.ptc.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeacherSubjectSkill.
 * @see com.ptc.model.TeacherSubjectSkill
 * @author Hibernate Tools
 */
@Stateless
public class TeacherSubjectSkillHome {

	private static final Log log = LogFactory
			.getLog(TeacherSubjectSkillHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeacherSubjectSkill transientInstance) {
		log.debug("persisting TeacherSubjectSkill instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeacherSubjectSkill persistentInstance) {
		log.debug("removing TeacherSubjectSkill instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeacherSubjectSkill merge(TeacherSubjectSkill detachedInstance) {
		log.debug("merging TeacherSubjectSkill instance");
		try {
			TeacherSubjectSkill result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeacherSubjectSkill findById(Integer id) {
		log.debug("getting TeacherSubjectSkill instance with id: " + id);
		try {
			TeacherSubjectSkill instance = entityManager.find(
					TeacherSubjectSkill.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
