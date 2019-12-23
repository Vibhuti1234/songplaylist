package com.mindtree.channelmanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Channel implements Comparable<Object> {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="channelId")
	private int channelId;
	@Column(name="channelName")
	private String channelName;
	@Column(name="price")
	private double price;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="channel")
	private List<Shows> shows=new ArrayList<Shows>();
	@ManyToOne
	private ChannelGroup channelGroup=new ChannelGroup();
	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Channel(int channelId, String channelName, double price, ChannelGroup channelGroup, List<Shows> shows) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.price = price;
		this.channelGroup = channelGroup;
		this.shows = shows;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ChannelGroup getChannelGroup() {
		return channelGroup;
	}
	public void setChannelGroup(ChannelGroup channelGroup) {
		this.channelGroup = channelGroup;
	}
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Channel e = (Channel) o;
		int iPriceComaprison = Double.compare(this.price, e.price);
		if (iPriceComaprison == 0)// Salaries are equal use name as comparison criteria
		{
			//  name comparison with rhs name
			return channelName.compareTo(e.channelName);
		}
		// Now if salaries are not equal, return comparison of salries
		return iPriceComaprison;
		
	}
	
}
