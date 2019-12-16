package com.mindtree.shopmanagementapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class ShopEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shopId")
	private int shopId;
	@Column(name = "shopName")
	private String shopName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "shopEntity")
	private List<ProductEntity> productEntity;

	public ShopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShopEntity(int shopId, String shopName, List<ProductEntity> productEntity) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.productEntity = productEntity;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<ProductEntity> getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(List<ProductEntity> productEntity) {
		this.productEntity = productEntity;
	}

}
