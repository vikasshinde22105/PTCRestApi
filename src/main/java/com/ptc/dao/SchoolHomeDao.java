package com.ptc.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ptc.model.School;
import com.ptc.util.HibernateUtil;

@Transactional
@Repository
public class SchoolHomeDao {
    public List<School> fetchAll() {
        System.out.println("SchoolDao: fetchAll");
        System.out.println("SchoolDao: START - fetching all schools from the database");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        List<School> fetchedSchool = (List<School>) session.createCriteria(School.class).list();

        System.out.println("DEBUG: includeAll ");
       

        return fetchedSchool;
    }

	public School fetchById(int schoolID) {
        System.out.println("UserDAO: fetch");
        System.out.println("UserDAO: START - fetching user from the database by user ID");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        School fetchedSchool = (School) session.get(School.class, schoolID);
        System.out.println("UserDAO: END - fetching user from the database by user ID");
        return fetchedSchool;
	}
}

