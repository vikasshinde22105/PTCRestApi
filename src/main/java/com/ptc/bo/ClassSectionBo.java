package com.ptc.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptc.dao.ClassBasicDao;
import com.ptc.dao.ClassSectionDao;
import com.ptc.dao.SchoolHomeDao;
import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSection;
import com.ptc.model.School;

@Service
public class ClassSectionBo {
	@Autowired
	ClassSectionDao classSection;
	
	 public List<ClassSection> fetchAll(int classId) {
	        System.out.println("SchoolDao: fetchAll");
	        List<ClassSection> fetchedClass = classSection.fetchAll(classId);
	        return fetchedClass;
	    }

	public List fetchById(int classId , int sectionId) {
		List fetchedClass = classSection.fetchById(classId , sectionId);
        return fetchedClass;
	}

}
