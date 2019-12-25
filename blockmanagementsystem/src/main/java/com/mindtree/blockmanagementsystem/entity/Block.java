package com.mindtree.blockmanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Block {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int blockId;
	@Column(unique=true)
	private String blockName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="blockId")
	private List<Shop> shops;
	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Block(int blockId, String blockName, List<Shop> shops) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
		this.shops = shops;
	}
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public List<Shop> getShops() {
		return shops;
	}
	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	
	

}
