package com.ptc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSubjects;
import com.ptc.model.Subject;
import com.ptc.util.HibernateUtil;

@Transactional
@Repository
public class ClassSubjectDao {
	@SuppressWarnings("unchecked")
	public List<ClassSubjects> fetchAll(int classId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<ClassSubjects> fetchedClass = (List<ClassSubjects>) session.createCriteria(ClassSubjects.class)
        		.add(Restrictions.eq("classInfo.id", classId))
        		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
//        		.setFetchMode("assocFiled",FetchMode.LAZY)
        		.list();
        System.out.println("DEBUG: includeAll ");
        return fetchedClass;
    }

	public List fetchById(int classId, int subjectId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
   //     ClassSubjects fetchedSubject = (ClassSubjects) session.get(ClassSubjects.class, subjectId);
//        String hql = "from classsubjects c left join fetch c.subject";
        String hql = "select c.subject"+
        			 " from ClassSubjects as c "+
        			 "left join c.subject"+
        			 " where c.classInfo.id = "+classId + "AND c.subject.id = "+subjectId+
        			 " order by c.id ";
        Query query = session.createQuery(hql);
        List listResult = query.list();
         
      /*  for ( aRow : listResult) {
            ClassSubjects classsubject = (ClassSubjects) aRow[0];
            Subject subject = (Subject) aRow[1];
            System.out.println(classsubject.getId() + " - " + subject.getName());
        
        }*/return listResult;
	}

}
