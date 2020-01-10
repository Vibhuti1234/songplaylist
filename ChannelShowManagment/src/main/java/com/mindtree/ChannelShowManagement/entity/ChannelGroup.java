package com.mindtree.ChannelShowManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChannelGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int channelgroupId;
		private String channelGroupName;
		@OneToMany(mappedBy ="channelgroup",cascade = CascadeType.PERSIST)
		private List<Channel> channellist;
		public int getChannelgroupId() {
			return channelgroupId;
		}
		public void setChannelgroupId(int channelgroupId) {
			this.channelgroupId = channelgroupId;
		}
		public String getChannelGroupName() {
			return channelGroupName;
		}
		public void setChannelGroupName(String channelGroupName) {
			this.channelGroupName = channelGroupName;
		}
		public List<Channel> getChannellist() {
			return channellist;
		}
		public void setChannellist(List<Channel> channellist) {
			this.channellist = channellist;
		}
		@Override
		public String toString() {
			return "ChannelGroup [channelgroupId=" + channelgroupId + ", channelGroupName=" + channelGroupName
					+ ", channellist=" + channellist + "]";
		}
		public ChannelGroup(int channelgroupId, String channelGroupName, List<Channel> channellist) {
			super();
			this.channelgroupId = channelgroupId;
			this.channelGroupName = channelGroupName;
			this.channellist = channellist;
		}
		public ChannelGroup() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
