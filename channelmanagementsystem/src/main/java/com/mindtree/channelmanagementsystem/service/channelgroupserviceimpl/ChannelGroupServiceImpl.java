package com.mindtree.channelmanagementsystem.service.channelgroupserviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channelmanagementsystem.dto.ChannelDto;
import com.mindtree.channelmanagementsystem.dto.ChannelGroupDto;
import com.mindtree.channelmanagementsystem.entity.Channel;
import com.mindtree.channelmanagementsystem.entity.ChannelGroup;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;
import com.mindtree.channelmanagementsystem.exception.NoSuchChannelGroupException;
import com.mindtree.channelmanagementsystem.repository.ChannelGroupRepository;
import com.mindtree.channelmanagementsystem.repository.ChannelRepository;
import com.mindtree.channelmanagementsystem.repository.ShowRepository;
import com.mindtree.channelmanagementsystem.service.ChannelGroupService;
@Service
public class ChannelGroupServiceImpl implements ChannelGroupService{
	@Autowired
	   ShowRepository showRepository;
	   @Autowired
	   ChannelGroupRepository channelGroupRepository;
	    @Autowired
	    ChannelRepository channelRepository;
	    ModelMapper modelMapper=new ModelMapper();
		@Override
		public String addChannelGroup(ChannelGroup channelGroup) {
			// TODO Auto-generated method stub
			//ChannelGroup channelGroup=convertDtoToEntity(channelGroupDto);
			channelGroupRepository.save(channelGroup);
			return "success";
		}
		private ChannelGroup convertDtoToEntity(ChannelGroupDto channelGroupDto) {
			// TODO Auto-generated method stub
			return modelMapper.map(channelGroupDto, ChannelGroup.class);
		}
		@Override
		public List<ChannelDto> getChannelByChannelId(int chanelGroupId) throws ChannelManagerControllerException {
			// TODO Auto-generated method stub
			List<ChannelGroup> channels=channelGroupRepository.findAll();
			ChannelGroup channelGroup=channels.stream().filter(i->i.getChannelGroupId()==chanelGroupId).findAny().orElseThrow(()->new NoSuchChannelGroupException("No Such Channel group exists"));
			List<Channel> channelList=channelGroup.getChannels();
			Collections.sort(channelList);
			List<ChannelDto> channelDtos=channelList.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
			return channelDtos;
			
		}
		private ChannelDto convertEntityToDto(Channel i) {
			// TODO Auto-generated method stub
			return modelMapper.map(i, ChannelDto.class);
		}
		
}
