package com.ptc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptc.bo.ClassBasicBo;
import com.ptc.bo.ClassSectionBo;
import com.ptc.model.ClassInfo;
import com.ptc.model.ClassSection;

@Controller
@RequestMapping("")
public class ClassSectionController {

	@Autowired
	ClassSectionBo classSectionBo;
	
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
//    @ResponseBody
//    public List<ClassSection> fetchAllUsers() {
//        return classSectionBo.fetchAll();
//    }
//
 /*   @RequestMapping(value = "/class/{classId}/section/{sectionId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List fetchSectionById(@PathVariable int classId , @PathVariable int sectionId) {
        return classSectionBo.fetchById(classId,sectionId);
    }
*/
}
