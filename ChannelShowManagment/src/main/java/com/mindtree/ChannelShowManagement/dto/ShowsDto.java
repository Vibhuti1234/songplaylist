package com.mindtree.ChannelShowManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ShowsDto {

	private int showId;
	private String showName;
	@JsonIgnoreProperties("showlist")
	private ChannelDto channel;
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
	@Override
	public String toString() {
		return "ShowsDto [showId=" + showId + ", showName=" + showName + ", channel=" + channel + "]";
	}
	public ShowsDto(int showId, String showName, ChannelDto channel) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.channel = channel;
	}
	public ShowsDto() {
		super();
	}
	
}
