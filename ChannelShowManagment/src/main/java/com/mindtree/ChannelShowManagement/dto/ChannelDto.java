package com.mindtree.ChannelShowManagement.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class ChannelDto
{
	private int channelId;
	private String channelName;
	private int channelPrice;
	@JsonIgnoreProperties("channellist")
	private ChannelGroupDto channelgroup;
	@JsonIgnoreProperties("channel")
	private List<ShowsDto> showlist;
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
	public int getChannelPrice() {
		return channelPrice;
	}
	public void setChannelPrice(int channelPrice) {
		this.channelPrice = channelPrice;
	}
	public ChannelGroupDto getChannelgroup() {
		return channelgroup;
	}
	public void setChannelgroup(ChannelGroupDto channelgroup) {
		this.channelgroup = channelgroup;
	}
	public List<ShowsDto> getShowlist() {
		return showlist;
	}
	public void setShowlist(List<ShowsDto> showlist) {
		this.showlist = showlist;
	}
	@Override
	public String toString() {
		return "ChannelDto [channelId=" + channelId + ", channelName=" + channelName + ", channelPrice=" + channelPrice
				+ ", channelgroup=" + channelgroup + ", showlist=" + showlist + "]";
	}
	public ChannelDto(int channelId, String channelName, int channelPrice, ChannelGroupDto channelgroup,
			List<ShowsDto> showlist) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelPrice = channelPrice;
		this.channelgroup = channelgroup;
		this.showlist = showlist;
	}
	public ChannelDto() {
		super();
	}
	
}
