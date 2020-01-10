package com.mindtree.ChannelShowManagement.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ChannelShowManagement.dto.ChannelDto;
import com.mindtree.ChannelShowManagement.dto.ChannelGroupDto;
import com.mindtree.ChannelShowManagement.dto.ShowsDto;
import com.mindtree.ChannelShowManagement.entity.Channel;
import com.mindtree.ChannelShowManagement.entity.ChannelGroup;
import com.mindtree.ChannelShowManagement.entity.Shows;
import com.mindtree.ChannelShowManagement.exception.NoSuchChannelFoundException;
import com.mindtree.ChannelShowManagement.exception.NoSuchChannelGroupFound;
import com.mindtree.ChannelShowManagement.exception.ServiceException;
import com.mindtree.ChannelShowManagement.repository.ChannelGroupRepository;
import com.mindtree.ChannelShowManagement.repository.ChannelRepository;
import com.mindtree.ChannelShowManagement.repository.ShowsRepository;
import com.mindtree.ChannelShowManagement.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService
{
	@Autowired
	ChannelGroupRepository channelgrouprepository;
	@Autowired
	ChannelRepository channelrepository;
	@Autowired
	ShowsRepository showrepository;;
	
	
	
	ModelMapper model=new ModelMapper();
	private ChannelGroupDto convertentityToDto(ChannelGroup channelgroup)
	{
		return  model.map(channelgroup, ChannelGroupDto.class);
	}
	private ChannelGroup convertDtotoEntity(ChannelGroupDto channelgroupdto)
	{
		return model.map(channelgroupdto, ChannelGroup.class);
			}
	
	private Channel convertDtotoentity(ChannelDto channeldto)
	{
		return model.map(channeldto, Channel.class);
		}
	private  ChannelDto convertentitytodto(Channel channel)
	{
		return model.map(channel,ChannelDto.class);
	}
	private Shows convertDtotoEntity(ShowsDto showsdto)
	{
		return model.map(showsdto, Shows.class);
	}
	private ShowsDto convertEntitytoDto(Shows shows)
	{
		return model.map(shows,ShowsDto.class);
		
	}
	
	@Override
	public ChannelGroupDto addchannelgrouptoDB(ChannelGroupDto channelgroupdto)
	{
		ChannelGroup channelgroup=convertDtotoEntity(channelgroupdto);
		channelgrouprepository.save(channelgroup);
		return convertentityToDto(channelgroup);
	
	}	
		@Override
	public ChannelDto addchanneltoDB(ChannelDto channeldto, int channelgroupId) throws NoSuchChannelGroupFound
		{
			ChannelGroup channelgroup=new ChannelGroup();
			if(channelgrouprepository.existsById(channelgroupId))
			{
			channelgroup=channelgrouprepository.getOne(channelgroupId);
			}
			else
			{
				throw new NoSuchChannelGroupFound("NO SUCH CHANNEL GROUP IS FOUND!!");
				
			}
			List<Channel> channeList=new ArrayList<Channel>();
	
			Channel channel=convertDtotoentity(channeldto);
			
			if(channelgroup.getChannellist().size()==0)
			{
				channeList.add(channel);
				channelgroup.setChannellist(channeList);
			}
			else
			{
				channelgroup.getChannellist().add(channel);
				}
			
			
			channel.setChannelgroup(channelgroup);
			channelrepository.save(channel);	
			
			return convertentitytodto(channel);
			}
		@Override
		public ShowsDto addshowtoDB(int channelId, ShowsDto showdto) throws ServiceException 
		{
			Optional<Channel>  channel1=channelrepository.findById(channelId);
			
			channel1.orElseThrow(()-> new NoSuchChannelGroupFound("no such channel is found"));
		
			Channel channel=channel1.get();
			
		List<Shows>showslist=new ArrayList<Shows>();
			Shows shows=convertDtotoEntity(showdto);
			if(channel.getShowlist().size()==0)
			{
				showslist.add(shows);
				channel.setShowlist(showslist);
			}
			else
			{
				channel.getShowlist().add(shows);
			}
			shows.setChannel(channel);
			showrepository.save(shows);
			
			return convertEntitytoDto(shows);
			
		}
		
		@Override
		public List<ChannelDto> getChannelsbyId(int channelgroupId) throws ServiceException
		{
			
			
				Optional<ChannelGroup>  channelgroup1=channelgrouprepository.findById(channelgroupId);
				
				channelgroup1.orElseThrow(()-> new NoSuchChannelGroupFound("no such channel group found"));
			
				ChannelGroup channelgroup=channelgroup1.get();
			
			List<ChannelDto> channeldtolist=new ArrayList<ChannelDto>();
			List<Channel> channellist=channelgroup.getChannellist();
			Collections.sort(channellist);
			channeldtolist=channellist.parallelStream().map(channel->convertentitytodto(channel)).collect(Collectors.toList());
			return channeldtolist;
			
		}
			
}
