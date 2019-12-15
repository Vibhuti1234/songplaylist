package com.mindtree.jpacafechainmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.jpacafechainmanagement.entity.Manager;
import com.mindtree.jpacafechainmanagement.service.ManagerService;

@RestController
public class ManagerController {
	@Autowired
	ManagerService managerservice;

	@PostMapping("/addManager")
	String addManager(@RequestBody Manager manager) {
		return managerservice.addManager(manager);
	}
}
