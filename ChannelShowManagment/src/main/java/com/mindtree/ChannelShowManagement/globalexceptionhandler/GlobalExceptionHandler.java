package com.mindtree.ChannelShowManagement.globalexceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.mindtree.ChannelShowManagement.exception.ChannelException;
import com.mindtree.ChannelShowManagement.exception.ServiceException;

@RestControllerAdvice
public class GlobalExceptionHandler {
Map<String,Object> response;
	
	@ExceptionHandler(ServiceException.class)
	protected ResponseEntity<Map<String,Object>> handleConflict(ChannelException e,WebRequest request)
	{
		response=new HashMap<String,Object>();
		response.put("message",e.getMessage());
		response.put("status",HttpStatus.BAD_REQUEST);
		response.put("body",null);
		response.put("error",true);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		
	}
	

}
