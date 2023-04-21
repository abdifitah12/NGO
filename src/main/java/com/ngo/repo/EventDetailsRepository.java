package com.ngo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ngo.controller.model.EventDetails;

import jakarta.transaction.Transactional;



@Repository
public interface EventDetailsRepository extends JpaRepository<EventDetails, Integer> {


	@Transactional
	@Modifying
	@Query("update EventDetails u set u.profilePicture = :profilePicture where u.id = :id")
	void uploadProfilePicture(@Param("id") int id,@Param("profilePicture") byte[] profilePicture);


}
