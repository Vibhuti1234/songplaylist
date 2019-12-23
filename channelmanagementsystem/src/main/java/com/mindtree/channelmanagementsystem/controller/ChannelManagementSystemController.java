package com.mindtree.channelmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.channelmanagementsystem.dto.ChannelDto;
import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.entity.ChannelGroup;
import com.mindtree.channelmanagementsystem.entity.Shows;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;
import com.mindtree.channelmanagementsystem.service.ChannelGroupService;
import com.mindtree.channelmanagementsystem.service.ChannelService;
import com.mindtree.channelmanagementsystem.service.ShowService;

@RestController
public class ChannelManagementSystemController {
	@Autowired
	private ChannelGroupService channelGroupService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private ShowService  showService;
	@PostMapping("/addChannelGroup")
	public String addChannelGroup(@RequestBody ChannelGroup channelGroup)
	{
		return channelGroupService.addChannelGroup(channelGroup);
	}
	@PostMapping("/addChannel/{channelGroupId}")
	public String addChannel(@PathVariable int channelGroupId, @RequestBody Channel channel) throws ChannelManagerControllerException
	{
		return channelService.addChannel(channelGroupId,channel);
	}
	@PostMapping("/addShow/{channelId}")
	public String addShow(@RequestBody Shows shows,@PathVariable int channelId) throws ChannelManagerControllerException
	{
		return showService.addShows(shows,channelId);
	}
	@GetMapping("/getChannelByChannelId/{chanelGroupId}")
	public List<ChannelDto> getChannelByChannelId(@PathVariable int chanelGroupId) throws ChannelManagerControllerException
	{
		return channelGroupService.getChannelByChannelId(chanelGroupId);
	}

}
