package com.usrome.usersecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usrome.usersecurity.services.ServiceCoyOutlet;
import com.usrome.usersecurity.services.ServiceUsers;



@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerCoyOutlet {
	
	@Autowired
	ServiceCoyOutlet serviceCoyOutlet;
	
	@GetMapping("/coyoutlet/getoutletname")
	public String getOutletName(String outletId) {
		return serviceCoyOutlet.getOutletName(outletId);
	}

}
