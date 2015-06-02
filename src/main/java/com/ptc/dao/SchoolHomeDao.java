package com.ptc.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ptc.model.School;
import com.ptc.util.HibernateUtil;

@Transactional
@Repository
public class SchoolHomeDao {
    public List<School> fetchAll(boolean includeAll) {
        System.out.println("SchoolDao: fetchAll");
        System.out.println("SchoolDao: START - fetching all parents from the database");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        List<School> fetchedSchool = (List<School>) session.createCriteria(School.class).
                list();

        System.out.println("DEBUG: includeAll [" + includeAll + "]");
       

        return fetchedSchool;
    }
}

