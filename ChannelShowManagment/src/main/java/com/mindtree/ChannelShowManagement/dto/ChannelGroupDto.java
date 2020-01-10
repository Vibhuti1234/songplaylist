package com.mindtree.ChannelShowManagement.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ChannelGroupDto {

	private int channelgroupId;
	private String channelGroupName;
	@JsonIgnoreProperties("channelgroup")
	private List<ChannelDto> channellist;
	public int getChannelgroupId() {
		return channelgroupId;
	}
	public void setChannelgroupId(int channelgroupId) {
		this.channelgroupId = channelgroupId;
	}
	public String getChannelGroupName() {
		return channelGroupName;
	}
	public void setChannelGroupName(String channelGroupName) {
		this.channelGroupName = channelGroupName;
	}
	public List<ChannelDto> getChannellist() {
		return channellist;
	}
	public void setChannellist(List<ChannelDto> channellist) {
		this.channellist = channellist;
	}
	@Override
	public String toString() {
		return "ChannelGroupDto [channelgroupId=" + channelgroupId + ", channelGroupName=" + channelGroupName
				+ ", channellist=" + channellist + "]";
	}
	public ChannelGroupDto(int channelgroupId, String channelGroupName, List<ChannelDto> channellist) {
		super();
		this.channelgroupId = channelgroupId;
		this.channelGroupName = channelGroupName;
		this.channellist = channellist;
	}
	public ChannelGroupDto() {
		super();
	}
	
}
