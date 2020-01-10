package com.mindtree.ChannelShowManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Channel implements Comparable<Channel> 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int channelId;
	private String channelName;
	private int channelPrice;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private ChannelGroup channelgroup;
	@OneToMany(mappedBy = "channel",cascade = CascadeType.PERSIST)
	private List<Shows> showlist;
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getChannelPrice() {
		return channelPrice;
	}
	public void setChannelPrice(int channelPrice) {
		this.channelPrice = channelPrice;
	}
	public ChannelGroup getChannelgroup() {
		return channelgroup;
	}
	public void setChannelgroup(ChannelGroup channelgroup) {
		this.channelgroup = channelgroup;
	}
	public List<Shows> getShowlist() {
		return showlist;
	}
	public void setShowlist(List<Shows> showlist) {
		this.showlist = showlist;
	}
	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", channelName=" + channelName + ", channelPrice=" + channelPrice
				+ ", channelgroup=" + channelgroup + ", showlist=" + showlist + "]";
	}
	public Channel(int channelId, String channelName, int channelPrice, ChannelGroup channelgroup,
			List<Shows> showlist) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelPrice = channelPrice;
		this.channelgroup = channelgroup;
		this.showlist = showlist;
	}
	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Channel channel) 
	{
		int result=0;
		result=this.channelPrice-channel.getChannelPrice(); 	
		if (result==0)
			result=this.channelName.compareTo(channel.getChannelName());
		return result;
		
		
		
		/*
		 * if(this.getChannelPrice()==channel.getChannelPrice()) result= 0; else
		 * if(this.getChannelPrice()>this.getChannelPrice()) result= 1; else result=-1;
		 * 
		 * if(result==0) { if(this.getChannelName().equals(channel.getChannelName()))
		 * result=0; else
		 * if(this.getChannelName().compareTo(channel.getChannelName())>0) result= 1;
		 * else result= -1;
		 * 
		 * }
		 */
	
	}
	
}
