package com.ptc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ptc.errorhandling.WebServiceError;
import com.ptc.errorhandling.WebServiceException;

public class ExceptionHandlerController {

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
