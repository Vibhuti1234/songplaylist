package com.mindtree.channelmanagementsystem.service.channelserviceimpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channelmanagementsystem.dto.ChannelDto;
import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.entity.ChannelGroup;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;
import com.mindtree.channelmanagementsystem.exception.NoSuchChannelGroupException;
import com.mindtree.channelmanagementsystem.repository.ChannelGroupRepository;
import com.mindtree.channelmanagementsystem.repository.ChannelRepository;
import com.mindtree.channelmanagementsystem.repository.ShowRepository;
import com.mindtree.channelmanagementsystem.service.ChannelService;
@Service
public class ChannelServiceImpl implements ChannelService{
	@Autowired
	   ShowRepository showRepository;
	   @Autowired
	   ChannelGroupRepository channelGroupRepository;
	    @Autowired
	    ChannelRepository channelRepository;
	    ModelMapper modelMapper=new ModelMapper();
		@Override
		public String addChannel(int channelGroupId, Channel channel) throws ChannelManagerControllerException {
			// TODO Auto-generated method stub
			List<ChannelGroup> channelGroups=channelGroupRepository.findAll();
			ChannelGroup channelGroup=channelGroups.stream().filter(i->i.getChannelGroupId()==channelGroupId).findAny().orElseThrow(()->new NoSuchChannelGroupException("No Channel Group Found"));
			//Channel channel=convertDtoToEntity(channelDto);
			channel.setChannelGroup(channelGroup);
			channelRepository.save(channel);
			
			return "success";
		}
		private Channel convertDtoToEntity(ChannelDto channelDto) {
			// TODO Auto-generated method stub
			return modelMapper.map(channelDto, Channel.class);
		}
		
}
