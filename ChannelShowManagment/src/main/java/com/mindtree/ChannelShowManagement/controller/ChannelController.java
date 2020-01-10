package com.mindtree.ChannelShowManagement.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ChannelShowManagement.dto.ChannelDto;
import com.mindtree.ChannelShowManagement.dto.ChannelGroupDto;
import com.mindtree.ChannelShowManagement.dto.ShowsDto;
import com.mindtree.ChannelShowManagement.entity.Channel;
import com.mindtree.ChannelShowManagement.exception.ChannelException;
import com.mindtree.ChannelShowManagement.exception.NoSuchChannelGroupFound;
import com.mindtree.ChannelShowManagement.exception.ServiceException;
import com.mindtree.ChannelShowManagement.service.ChannelService;

@RestController
public class ChannelController
{
	@Autowired
	ChannelService channelservice;
	
	@PostMapping("/addachannelgroup")
	public ResponseEntity<Map<String,Object>> addchannelgroup(@RequestBody ChannelGroupDto channelgroupdto)
	{
		Map<String,Object> response=new LinkedHashMap<String,Object>();
		response.put("header", "KalingaChannel");
		response.put("Error",false);
		response.put("message", channelservice.addchannelgrouptoDB(channelgroupdto));
		response.put("HttpStatus",HttpStatus.ACCEPTED);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		
	}
	
	@PostMapping("/addachannel/{channelgroupId}")
	public ChannelDto addchannel(@PathVariable int channelgroupId,@RequestBody ChannelDto channeldto) throws ChannelException
	{
		return channelservice.addchanneltoDB(channeldto,channelgroupId);
	}
	
	@PostMapping("/addashow/{channelId}")
	public ShowsDto addshow(@PathVariable int channelId,@RequestBody ShowsDto showdto) throws ChannelException
	{
		return channelservice.addshowtoDB(channelId,showdto);
		
	}
	@GetMapping("/showallsortedchannels/{channelgroupId}")
	public ResponseEntity<Map<String,Object>> getchannels(@PathVariable int channelgroupId) throws ChannelException
	{
		Map<String,Object> response=new LinkedHashMap<String,Object>();
		response.put("header", "KalingaChannel");
		response.put("Error",false);
		response.put("message", channelservice.getChannelsbyId(channelgroupId));
		response.put("HttpStatus",HttpStatus.ACCEPTED);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		
	}

		
		
	

}
