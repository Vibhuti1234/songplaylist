package com.mindtree.channelmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ShowDto {
	private int showId;
	private String showName;
	@JsonIgnoreProperties("shows")
	private ChannelDto channel=new ChannelDto();
	public ShowDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowDto(int showId, String showName, ChannelDto channel) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.channel = channel;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public ChannelDto getChannel() {
		return channel;
	}
	public void setChannel(ChannelDto channel) {
		this.channel = channel;
	}
    
}
