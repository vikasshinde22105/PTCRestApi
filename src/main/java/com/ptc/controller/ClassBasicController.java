package com.ptc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptc.bo.ClassBasicBo;
import com.ptc.bo.ClassSectionBo;
import com.ptc.bo.ClassSubjectBo;
import com.ptc.bo.SchoolBasicBo;
import com.ptc.errorhandling.WebServiceError;
import com.ptc.errorhandling.WebServiceException;
import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSection;
import com.ptc.model.ClassSubjects;
import com.ptc.model.School;

@Controller
@RequestMapping("class")
public class ClassBasicController {

	@Autowired
	ClassBasicBo classBasicBo;
	
	@Autowired
	ClassSectionBo classSectionBo;

	@Autowired
	ClassSubjectBo classSubjectBo;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ClassInfo> fetchAllClass() {
        return classBasicBo.fetchAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ClassInfo fetchClassById(@PathVariable int id) {
         ClassInfo info= classBasicBo.fetchById(id);
         System.out.println("Data"+info.getClassSubjectses());
         return info;
         
    }

    @RequestMapping(value = "/{classId}/section", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ClassSection> fetchAllSection(@PathVariable int classId) {
        return classSectionBo.fetchAll(classId);
    }

    @RequestMapping(value = "/{classId}/section/{sectionId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List fetchSectionById(@PathVariable int classId , @PathVariable int sectionId) {
        return classSectionBo.fetchById(classId,sectionId);
    }
    
    @RequestMapping(value = "/{classId}/subjects",method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ClassSubjects> fetchClassSubjects(@PathVariable int classId)
    {
    	return classSubjectBo.fetchAll(classId);
    }
    
    @RequestMapping(value = "/{classId}/subjects/{subjectId}",method = RequestMethod.GET , produces = "application/json")
    @ResponseBody
    public List fetchSubjectById(@PathVariable int classId , @PathVariable int subjectId)
    {
    	return classSubjectBo.fetchById(classId , subjectId);
    }
}
