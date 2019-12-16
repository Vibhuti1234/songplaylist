package com.mindtree.shopmanagementapplication.service.productentityserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shopmanagementapplication.dto.ProductDto;
import com.mindtree.shopmanagementapplication.entity.BrandEntity;
import com.mindtree.shopmanagementapplication.entity.ProductEntity;
import com.mindtree.shopmanagementapplication.entity.ShopEntity;
import com.mindtree.shopmanagementapplication.exception.NoSuchBrandIdException;
import com.mindtree.shopmanagementapplication.exception.NoSuchProduct;
import com.mindtree.shopmanagementapplication.exception.ShopManagementControllerException;
import com.mindtree.shopmanagementapplication.repository.BrandEntityRepository;
import com.mindtree.shopmanagementapplication.repository.ProductEntityRepository;
import com.mindtree.shopmanagementapplication.repository.ShopEntityRepository;
import com.mindtree.shopmanagementapplication.service.ProductEntityService;

@Service
public class ProductEntityServiceImpl implements ProductEntityService {
	@Autowired
	ShopEntityRepository shopRepo;
	@Autowired
	ProductEntityRepository productRepo;
	@Autowired
	BrandEntityRepository brandRepo;
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public String addProduct(ProductDto productDto) {
		int c = 0;
		int k = 0;
		// TODO Auto-generated method stub
		ProductEntity productEntity = convertDtoToEntity(productDto);
		BrandEntity brandEntity = productEntity.getBrandEntity();
		List<BrandEntity> brandEntities = brandRepo.findAll();
		if (brandEntities != null && brandEntity != null) {
			for (BrandEntity brandEntity2 : brandEntities) {
				if (brandEntity2.getBrandId() == brandEntity.getBrandId()) {
					c = 1;
					break;
				}

			}
		}
		if (c == 0) {
			brandRepo.save(brandEntity);
		}
		ShopEntity shopEntity = productEntity.getShopEntity();
		List<ShopEntity> shopEntities = shopRepo.findAll();
		if (shopEntities != null && shopEntity != null) {
			for (ShopEntity shopEntity2 : shopEntities) {
				if (shopEntity2.getShopId() == shopEntity.getShopId()) {
					k = 1;
					break;
				}

			}
		}
		if (k == 0) {
			shopRepo.save(shopEntity);
		}

		productEntity.setBrandEntity(brandEntity);
		;
		productEntity.setShopEntity(shopEntity);
		;
		productRepo.save(productEntity);
		return "Success";

	}

	private ProductEntity convertDtoToEntity(ProductDto productDto) {
		// TODO Auto-generated method stub
		return modelMapper.map(productDto, ProductEntity.class);

	}

	@Override
	public List<ProductDto> getProduct() throws ShopManagementControllerException {
		// TODO Auto-generated method stub
		List<ProductEntity> product = productRepo.findAll();
		List<ProductEntity> products = new ArrayList<ProductEntity>();
		for (ProductEntity productEntity : product) {
			if (productEntity.getCost() > 100) {
				products.add(productEntity);
			}

		}
		if (products.size() == 0) {
			throw new NoSuchProduct("No product Found");
		}
		List<ProductDto> productDtos = products.stream().map(entity -> convertEntityToDto(entity))
				.collect(Collectors.toList());
		return productDtos;
	}

	private ProductDto convertEntityToDto(ProductEntity entity) {
		// TODO Auto-generated method stub
		return modelMapper.map(entity, ProductDto.class);

	}

	@Override
	public List<ProductDto> getProductByBrand(int brandId) throws ShopManagementControllerException {
		List<BrandEntity> brands=brandRepo.findAll();
		BrandEntity brand=brands.stream().filter(i->i.getBrandId()==brandId).findAny().orElseThrow(()->new NoSuchBrandIdException("No Such Brand Id Exists"));
		List<ProductEntity> products=brand.getProductEntity().stream().filter(i->i.getCost()>100).collect(Collectors.toList());
		if(products==null)
		{
			throw new NoSuchBrandIdException("Brand Not Found");
		}
		List<ProductDto> productDtos = products.stream().map(entity -> convertEntityToDto(entity))
				.collect(Collectors.toList());
		return productDtos;
		
	}

}
