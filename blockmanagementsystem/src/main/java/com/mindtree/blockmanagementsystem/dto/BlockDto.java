package com.mindtree.blockmanagementsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BlockDto {

	private int blockId;
	private String blockName;
	@JsonIgnore
	private List<ShopDto> shops;

	public BlockDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlockDto(int blockId, String blockName, List<ShopDto> shops) {
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

	public List<ShopDto> getShops() {
		return shops;
	}

	public void setShops(List<ShopDto> shops) {
		this.shops = shops;
	}

}
