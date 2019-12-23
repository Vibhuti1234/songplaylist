package com.mindtree.channelmanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ChannelDto {
	private int channelId;
	private String channelName;
	private double price;
	@JsonIgnoreProperties("channels")
	private ChannelGroupDto channelGroup=new ChannelGroupDto();
	@JsonIgnoreProperties("channel")
	private List<ShowDto> shows=new ArrayList<ShowDto>();
	public ChannelDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChannelDto(int channelId, String channelName, double price, ChannelGroupDto channelGroup,
			List<ShowDto> shows) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.price = price;
		this.channelGroup = channelGroup;
		this.shows = shows;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ChannelGroupDto getChannelGroup() {
		return channelGroup;
	}
	public void setChannelGroup(ChannelGroupDto channelGroup) {
		this.channelGroup = channelGroup;
	}
	public List<ShowDto> getShows() {
		return shows;
	}
	public void setShows(List<ShowDto> shows) {
		this.shows = shows;
	}
	

}
