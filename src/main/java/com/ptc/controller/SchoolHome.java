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
 
    // Exception handler for WebServiceException cases
    @ExceptionHandler(WebServiceException.class)
    public ResponseEntity<WebServiceError> handleWebServiceException(WebServiceException webServiceException) {
        System.out.println("SchoolHomeController.handleWebServiceException");
        WebServiceError webServiceError = new WebServiceError(webServiceException.getExceptionCode(), webServiceException.getExceptionMessage());

        // This should happen in case of input constraint validations
        if(webServiceException.getExceptionMessageList() != null) {
            webServiceError.setErrorMessageList(webServiceException.getExceptionMessageList());
        }
        return new ResponseEntity<WebServiceError>(webServiceError, HttpStatus.BAD_REQUEST);
    }

    // Exception handler for generic Exception cases
    @ExceptionHandler(Exception.class)
    public ResponseEntity<WebServiceError> handleException(Exception exception) {
        System.out.println("SchoolHomeController.handleException");
        WebServiceError webServiceError = new WebServiceError(400, exception.getMessage());
        return new ResponseEntity<WebServiceError>(webServiceError, HttpStatus.BAD_REQUEST);
    }

}
