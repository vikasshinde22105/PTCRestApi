package com.ptc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptc.model.School;
import com.ptc.service.SchoolHomeService;

@Controller
@RequestMapping("school")
public class SchoolHome {
	@Autowired
	SchoolHomeService schoolhomeservice;
	
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<School> fetchAllUsers() {
        return schoolhomeservice.fetchAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public School fetchById(@PathVariable int id) {
        return schoolhomeservice.fetchById(id);
    }
}
