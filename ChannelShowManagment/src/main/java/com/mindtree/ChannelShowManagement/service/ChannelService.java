package com.mindtree.ChannelShowManagement.service;

import java.util.List;

import com.mindtree.ChannelShowManagement.dto.ChannelDto;
import com.mindtree.ChannelShowManagement.dto.ChannelGroupDto;
import com.mindtree.ChannelShowManagement.dto.ShowsDto;
import com.mindtree.ChannelShowManagement.entity.Channel;
import com.mindtree.ChannelShowManagement.exception.NoSuchChannelGroupFound;
import com.mindtree.ChannelShowManagement.exception.ServiceException;

public interface ChannelService {

	/**
	 * @param channelgroupdto
	 * @return channelgroupdto after saving channelgroup to repositoty
	 */
	ChannelGroupDto addchannelgrouptoDB(ChannelGroupDto channelgroupdto);
	/**
	 * @param channeldto
	 * @param channelgroupId
	 * @return channeldto after saving channel to repository
	 * @throws NoSuchChannelGroupFound 
	 */
	ChannelDto addchanneltoDB(ChannelDto channeldto, int channelgroupId) throws NoSuchChannelGroupFound;
	/**
	 * @param channelId
	 * @param showdto
	 * @return showdto after saving show to repository
	 * @throws ServiceException 
	 */
	ShowsDto addshowtoDB(int channelId, ShowsDto showdto) throws ServiceException;
	/**
	 * @param channelgroupId
	 * @return channels by channelgroup
	 * @throws ServiceException
	 */
	List<ChannelDto> getChannelsbyId(int channelgroupId) throws ServiceException;



}
