package com.mindtree.channelmanagementsystem.service.showserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.entity.Shows;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;
import com.mindtree.channelmanagementsystem.exception.NoSuchChannelException;
import com.mindtree.channelmanagementsystem.repository.ChannelGroupRepository;
import com.mindtree.channelmanagementsystem.repository.ChannelRepository;
import com.mindtree.channelmanagementsystem.repository.ShowRepository;
import com.mindtree.channelmanagementsystem.service.ChannelGroupService;
import com.mindtree.channelmanagementsystem.service.ShowService;
@Service
public class ShowServiceImpl implements ShowService{
   @Autowired
   ShowRepository showRepository;
   @Autowired
   ChannelGroupRepository channelGroupRepository;
    @Autowired
    ChannelRepository channelRepository;
	@Override
	public String addShows(Shows shows, int channelId) throws ChannelManagerControllerException {
		// TODO Auto-generated method stub
		List<Channel> channels=channelRepository.findAll();
		Channel channel=channels.stream().filter(i->i.getChannelId()==channelId).findAny().orElseThrow(()->new NoSuchChannelException("No Channel Existing"));
		shows.setChannel(channel);
		showRepository.save(shows);
		return "success";
	}


	
}
