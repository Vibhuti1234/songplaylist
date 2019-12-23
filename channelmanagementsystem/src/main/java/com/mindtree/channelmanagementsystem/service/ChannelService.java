package com.mindtree.channelmanagementsystem.service;

import com.mindtree.channelmanagementsystem.dto.ChannelDto;
import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;
import com.mindtree.channelmanagementsystem.exception.NoSuchChannelGroupException;

public interface ChannelService {

	String addChannel(int channelGroupId, Channel channel) throws ChannelManagerControllerException ;

}
