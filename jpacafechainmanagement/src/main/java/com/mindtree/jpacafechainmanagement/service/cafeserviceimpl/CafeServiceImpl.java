package com.mindtree.jpacafechainmanagement.service.cafeserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.jpacafechainmanagement.entity.Cafe;
import com.mindtree.jpacafechainmanagement.entity.Manager;
import com.mindtree.jpacafechainmanagement.exception.ManagerNotFoundException;
import com.mindtree.jpacafechainmanagement.exception.NoSuchCafeExistsException;
import com.mindtree.jpacafechainmanagement.repository.CafeRepository;
import com.mindtree.jpacafechainmanagement.repository.ManagerRepository;
import com.mindtree.jpacafechainmanagement.service.CafeService;

//import com.mindtree.learning.jpacampusmindgenie.entity.CampusMind;
//import com.mindtree.learning.jpacampusmindgenie.entity.Genie;
@Service
public class CafeServiceImpl implements CafeService {
	@Autowired
	CafeRepository caferepo;
	@Autowired
	ManagerRepository managerrepo;

	public String addCafe(Cafe cafe, int mid) {

		Manager manager = managerrepo.getOne(mid);
		cafe.setManager(manager);
		caferepo.save(cafe);

		return "Success";
	}

	public List<Cafe> getCafe(int mid) throws ManagerNotFoundException {

		Optional<Manager> optmanager = managerrepo.findById(mid);
		optmanager.orElseThrow(() -> new ManagerNotFoundException());
		List<Cafe> generatecafe = optmanager.get().getCafe();
		return generatecafe;
	}

	@Override
	public List<Cafe> getCafeWithRevenueGreaterThanX(double revenue) throws NoSuchCafeExistsException {
		List<Cafe> liCafe = caferepo.findAll();
		List<Cafe> listCafe = new ArrayList<>();
		int count = 0;
		for (Cafe cafe : liCafe) {
			if (cafe.getCafeRevenue() > revenue) {
				listCafe.add(cafe);
				count++;
			}

		}

		if (count == 0) {
			throw new NoSuchCafeExistsException("Cafe Not found Of That Much revenue:");
		}
		return listCafe;

	}

}
