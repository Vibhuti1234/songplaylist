package com.mindtree.shopmanagementapplication.service.shopentityserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shopmanagementapplication.repository.BrandEntityRepository;
import com.mindtree.shopmanagementapplication.repository.ProductEntityRepository;
import com.mindtree.shopmanagementapplication.repository.ShopEntityRepository;
import com.mindtree.shopmanagementapplication.service.ShopEntityService;
@Service
public class ShopEntityServiceImpl implements ShopEntityService {
	@Autowired
	ShopEntityRepository shopRepo;
	@Autowired
	ProductEntityRepository productRepo;
	@Autowired
	BrandEntityRepository brandRepo;

}
