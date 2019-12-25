package com.mindtree.insurancepolicy.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.mindtree.insurancepolicy.controller.InsurancePolicyController;
import com.mindtree.insurancepolicy.dto.ErrorDto;
import com.mindtree.insurancepolicy.exception.ServiceException;
@RestControllerAdvice(assignableTypes= {InsurancePolicyController.class})
public class ControllerExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorDto> serviceExceptionHandler(Exception e, Throwable cause){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorDto(e.getMessage(), cause));
	}

}
