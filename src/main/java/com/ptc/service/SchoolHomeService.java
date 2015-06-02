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
	
	 public List<School> fetchAll() {
	        System.out.println("SchoolDao: fetchAll");
	        List<School> fetchedSchool = schoolhome.fetchAll();
	        return fetchedSchool;
	    }

	public School fetchById(int id) {
		School fetchedSchool = schoolhome.fetchById(id);
        return fetchedSchool;
	}
	   

}
