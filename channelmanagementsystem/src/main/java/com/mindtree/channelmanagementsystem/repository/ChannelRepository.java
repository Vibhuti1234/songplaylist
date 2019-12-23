package com.mindtree.channelmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.channelmanagementsystem.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Integer> {

}
