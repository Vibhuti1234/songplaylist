package com.mindtree.jpacafechainmanagement.service;

import java.util.List;

import com.mindtree.jpacafechainmanagement.entity.Cafe;
import com.mindtree.jpacafechainmanagement.exception.ManagerNotFoundException;
import com.mindtree.jpacafechainmanagement.exception.NoSuchCafeExistsException;

public interface CafeService {
	String addCafe(Cafe cafe, int mid);

	List<Cafe> getCafe(int mid) throws ManagerNotFoundException;

	List<Cafe> getCafeWithRevenueGreaterThanX(double revenue) throws NoSuchCafeExistsException;

}
