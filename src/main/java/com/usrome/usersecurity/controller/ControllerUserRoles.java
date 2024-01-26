package com.usrome.usersecurity.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usrome.usersecurity.model.ApplUserRoles;
import com.usrome.usersecurity.model.ApplUsers;
import com.usrome.usersecurity.services.ServiceUserRoles;

import jakarta.transaction.Transactional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerUserRoles {
	@Autowired
	ServiceUserRoles serviceUserRoles;
	
	@GetMapping("/userroles/getuserroles")
	public List<ApplUserRoles> getUser(String userId){
		return serviceUserRoles.getUserById(userId);
	}
	
	@GetMapping("/userroles/getuserroleid")
	public Optional<ApplUserRoles> getUserRoleId(String userId, Integer roleId){
		return serviceUserRoles.getUserRoleId(userId, roleId);
	}
	
	@PostMapping("/userroles/adduserrole")
	 public void addUserRoles (@RequestBody ApplUserRoles data) {
		 serviceUserRoles.addUserRoles(data);
	 }
	
	
	@PutMapping("/userroles/putuserrole")
	public void putUserRoles(Integer roleId,@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss") Date effFromDate, 
			@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss ") Date effToDate, String updatedBy, 
			@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss") Date updatedDate, String userIdOld, Integer roleIdOld) {
	//	System.out.println("aaaaaa : "+roleId+" - "+effFromDate+" - "+userIdOld+" - "+roleIdOld);
		serviceUserRoles.putUserRole(roleId, effFromDate, effToDate, updatedBy, updatedDate, userIdOld, roleIdOld);
	}



}
