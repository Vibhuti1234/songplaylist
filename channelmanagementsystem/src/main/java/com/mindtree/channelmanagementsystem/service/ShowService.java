package com.mindtree.channelmanagementsystem.service;

import com.mindtree.channelmanagementsystem.entity.Shows;
import com.mindtree.channelmanagementsystem.exception.ChannelManagerControllerException;

public interface ShowService {

	String addShows(Shows shows, int channelId) throws ChannelManagerControllerException;





}
