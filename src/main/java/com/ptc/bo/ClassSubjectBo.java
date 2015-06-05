package com.ptc.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptc.dao.ClassBasicDao;
import com.ptc.dao.ClassSubjectDao;
import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSubjects;

@Service
public class ClassSubjectBo {

	@Autowired
	ClassSubjectDao classSubjectDao;
	
	 public List<ClassSubjects> fetchAll(int classId) {
	        List<ClassSubjects> fetchedClass = classSubjectDao.fetchAll(classId);
	        return fetchedClass;
	    }

	public List fetchById(int classId , int subjectId) {
		List fetchedClass = classSubjectDao.fetchById(classId , subjectId);
        return fetchedClass;
	}

}
