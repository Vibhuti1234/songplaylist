package com.mindtree.channelmanagementsystem.service;

import java.util.List;

import com.mindtree.channelmanagementsystem.dto.ChannelDto;
import com.mindtree.channelmanagementsystem.dto.ChannelGroupDto;
import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.entity.ChannelGroup;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;

public interface ChannelGroupService {

	String addChannelGroup(ChannelGroup channelGroup);

	List<ChannelDto> getChannelByChannelId(int chanelGroupId) throws ChannelManagerControllerException;

}
