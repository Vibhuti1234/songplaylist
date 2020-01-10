package com.mindtree.ChannelShowManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ChannelShowManagement.entity.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows, Integer> {

}
