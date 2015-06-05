package com.ptc.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptc.dao.ClassBasicDao;
import com.ptc.dao.SchoolHomeDao;
import com.ptc.model.ClassInfo;
import com.ptc.model.School;

@Service
public class ClassBasicBo {
	@Autowired
	ClassBasicDao classBasic;
	
	 public List<ClassInfo> fetchAll() {
	        System.out.println("SchoolDao: fetchAll");
	        List<ClassInfo> fetchedClass = classBasic.fetchAll();
	        return fetchedClass;
	    }

	public ClassInfo fetchById(int id) {
		ClassInfo fetchedClass = classBasic.fetchById(id);
        return fetchedClass;
	}
	
	public List<ClassInfo> fetchClassSectionById(int classId, String sectionName){
		System.out.println("SectionDao");
		List<ClassInfo> fetchedSection = classBasic.fetchSectioById(classId, sectionName);
		return fetchedSection;

	}


}
