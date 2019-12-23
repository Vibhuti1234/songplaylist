package com.mindtree.channelmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Shows {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="showId")
	private int showId;
	@Column(name="showName")
	private String showName;
	@ManyToOne
	@JoinColumn(name="channelId",nullable=false)
	private Channel channel=new Channel();
	public Shows() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shows(int showId, String showName, Channel channel) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.channel = channel;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	

}
