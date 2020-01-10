package com.mindtree.ChannelShowManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ChannelShowManagement.entity.ChannelGroup;
@Repository
public interface ChannelGroupRepository extends JpaRepository<ChannelGroup, Integer> {

}
