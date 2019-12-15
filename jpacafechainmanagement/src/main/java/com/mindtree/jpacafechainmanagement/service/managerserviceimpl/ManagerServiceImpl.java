package com.mindtree.jpacafechainmanagement.service.managerserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.jpacafechainmanagement.entity.Manager;
import com.mindtree.jpacafechainmanagement.repository.ManagerRepository;
import com.mindtree.jpacafechainmanagement.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerRepository managerrepo;

	public String addManager(Manager manager) {
		managerrepo.save(manager);
		return "success";
	}

}
