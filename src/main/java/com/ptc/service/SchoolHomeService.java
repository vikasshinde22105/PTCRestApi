package com.ptc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ptc.dao.SchoolHomeDao;
import com.ptc.model.School;

@Component
public class SchoolHomeService {
	
	@Autowired
	SchoolHomeDao schoolhome;
	
	 public List<School> fetchAll(boolean includeAll) {
	        System.out.println("ParentDeo: fetchAll");
	        List<School> fetchedSchool = schoolhome.fetchAll(includeAll);
	        return fetchedSchool;
	    }
	   

}
