package com.mindtree.channelmanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ChannelGroupDto {
	private int channelGroupId;
	private String channelGroupName;
	@JsonIgnoreProperties("channelGroup")
	private List<ChannelDto> channels=new ArrayList<ChannelDto>();
	public ChannelGroupDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChannelGroupDto(int channelGroupId, String channelGroupName, List<ChannelDto> channels) {
		super();
		this.channelGroupId = channelGroupId;
		this.channelGroupName = channelGroupName;
		this.channels = channels;
	}
	public int getChannelGroupId() {
		return channelGroupId;
	}
	public void setChannelGroupId(int channelGroupId) {
		this.channelGroupId = channelGroupId;
	}
	public String getChannelGroupName() {
		return channelGroupName;
	}
	public void setChannelGroupName(String channelGroupName) {
		this.channelGroupName = channelGroupName;
	}
	public List<ChannelDto> getChannels() {
		return channels;
	}
	public void setChannels(List<ChannelDto> channels) {
		this.channels = channels;
	}
	

}
