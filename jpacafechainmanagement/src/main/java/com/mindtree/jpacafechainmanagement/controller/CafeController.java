package com.mindtree.jpacafechainmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.jpacafechainmanagement.entity.Cafe;
import com.mindtree.jpacafechainmanagement.exception.ManagerNotFoundException;
import com.mindtree.jpacafechainmanagement.exception.NoSuchCafeExistsException;
import com.mindtree.jpacafechainmanagement.service.CafeService;

@RestController
public class CafeController {
	@Autowired
	CafeService cafeservice;

	@PostMapping("/addCafe/{mid}")
	String addCafe(@RequestBody Cafe cafe, @PathVariable int mid) {
		return cafeservice.addCafe(cafe, mid);
	}

	@GetMapping("/getCafeByMid/{mid}")
	List<Cafe> getCafeByMid(@PathVariable int mid) {
		try {
			return cafeservice.getCafe(mid);
		} catch (ManagerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/getCafeWithRevenueGreaterThanX/{revenue}")
	List<Cafe> getCafeWithRevenueGreaterThanX(@PathVariable double revenue) {
		try {
			return cafeservice.getCafeWithRevenueGreaterThanX(revenue);
		} catch (NoSuchCafeExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
