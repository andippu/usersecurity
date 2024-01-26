package com.usrome.usersecurity.controller;
import java.util.List;
import java.util.Optional;

import com.usrome.usersecurity.model.ModelUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.usrome.usersecurity.model.ApplUsers;
import com.usrome.usersecurity.services.ServiceUsers;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerUser {
	@Autowired
	ServiceUsers serviceUsers;
	
	@GetMapping("/users/getusers")
	public List<ApplUsers> getUser(){
		return serviceUsers.getUsers();
	}
	
	@GetMapping("/users/checklogin")
	public String checkLogin(String userId, String userPass){
		String vstring = serviceUsers.checkLogin(userId, userPass);
		Integer vt=vstring.length();
		return vstring;
	}

	@GetMapping("/users/getuserlist")
	public List<ModelUserList> getUsersList (){
		return serviceUsers.getUsersList();
	};
	
	@GetMapping("/users/getuserbyid")
	public Optional<ApplUsers> getUserById(String userId){
		 return serviceUsers.getUserById(userId);
	}
	
	@PostMapping("/users/adduser")
	public ApplUsers addUser(@RequestBody ApplUsers data){
		return serviceUsers.addUser(data);
	}
	
	@DeleteMapping("/users/deleteuser")
	public void delUserById  (String id) {
		serviceUsers.delUserById(id);
	}
/*
	@GetMapping("/with-student/{school-id}")
	public ResponseEntity<FullSchoolResponse> findAllSchools(
			@PathVariable{"school-id"} Integer schoolId){
		return ResponseEntity.ok(service.findSchoolWithStudent(shoolId));
	}
	)*/
	
	

}






