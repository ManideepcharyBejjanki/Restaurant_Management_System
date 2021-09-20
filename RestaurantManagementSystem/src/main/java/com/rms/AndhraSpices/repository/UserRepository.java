package com.rms.AndhraSpices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rms.AndhraSpices.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

	@Query("SELECT user.emailId from User user")
	public List<String> getEmailIdList();
	
	@Query("SELECT user.mobileNumber from User user")
	public List<String> getMobileNumberList();
}
