package com.ptc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSection;
import com.ptc.model.School;
import com.ptc.util.HibernateUtil;

@Transactional
@Repository
public class ClassBasicDao {

	public List<ClassInfo> fetchAll() {
        System.out.println("ClassDao: fetchAll");
        System.out.println("ClassDao: START - fetching all schools from the database");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        List<ClassInfo> fetchedClass = (List<ClassInfo>) session.createCriteria(ClassInfo.class).list();

        System.out.println("DEBUG: includeAll ");
       

        return fetchedClass;
    }

	public ClassInfo fetchById(int classID) {
        System.out.println("UserDAO: fetch");
        System.out.println("UserDAO: START - fetching user from the database by user ID");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        ClassInfo fetchedClass = (ClassInfo) session.get(ClassInfo.class, classID);
        System.out.println("UserDAO: END - fetching user from the database by user ID");
        return fetchedClass;
	}
	
	public List fetchSectioById(int classID , String classSectionName){
		Session session = HibernateUtil.getSessionFactory().openSession();
//Criteria criteria=session.createCriteria(ClassInfo.class);
		//criteria.add(Restrictions.eq("id", classID));
		//criteria.createAlias("classSections", "section");
	//	criteria.add(Restrictions.eq("section.name", classSectionName).ignoreCase());
		String hql = "FROM ClassInfo AS E";
		Query query = session.createQuery(hql);
		List results = query.list();
		return   results;
	}

}
