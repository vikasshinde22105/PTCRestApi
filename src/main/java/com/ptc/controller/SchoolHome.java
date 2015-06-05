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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptc.bo.SchoolHomeService;
import com.ptc.exception.*;
import com.ptc.model.School;

@Controller
@RequestMapping("school")
public class SchoolHome extends ExceptionHandlerController {
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
