package com.mindtree.sportsmanagementapplication.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mysql.fabric.xmlrpc.base.Data;

@RestControllerAdvice
public class ExceptionHandler {
   
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<Map<String, Object>> exceptionHandler(SportsManagementControllerException e){
		
		Map<String, Object> error=new HashMap<String, Object>();
		error.put("status", HttpStatus.NOT_FOUND.value());
		
		error.put("errorMessage", e.getMessage());
		
		error.put("time stamp", new Date());
	
		
		return new ResponseEntity<Map<String,Object>>(error, HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
}
