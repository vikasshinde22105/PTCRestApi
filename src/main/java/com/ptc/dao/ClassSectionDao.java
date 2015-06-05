package com.ptc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSection;
import com.ptc.util.HibernateUtil;

@Transactional
@Repository
public class ClassSectionDao {

	@SuppressWarnings("unchecked")
	public List<ClassSection> fetchAll(int classId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<ClassSection> fetchedClass = (List<ClassSection>) session.createCriteria(ClassSection.class)
        		.add(Restrictions.eq("classInfo.id", classId))
        		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
        		.list();
        System.out.println("DEBUG: includeAll ");
        return fetchedClass;
    }

	public List fetchById(int classId,int sectionId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
    	String hql = "FROM ClassSection AS E where E.classInfo.id ="+classId+" AND E.id = "+sectionId;
		Query query = session.createQuery(hql);
		List results = query.list();
		return   results;
	}

}
