package com.usrome.usersecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.usrome.usersecurity.services.ServiceRoles;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerRoles {
	
	@Autowired
	ServiceRoles serviceRoles;
	
	@GetMapping("/role/getrolename")
	public String getRoleName(Integer roleId) {
		return serviceRoles.getRoleName(roleId);
	}

}
