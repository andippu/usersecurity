package com.usrome.usersecurity.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.usrome.usersecurity.model.ModelUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.usrome.usersecurity.model.ApplUsers;
import com.usrome.usersecurity.repository.IApplUsersRepository;

@Service
public class ServiceUsers {
	
	@Autowired
	IApplUsersRepository repoUsers;
	
	public List<ApplUsers> getUsers(){
		 var list=new ArrayList<ApplUsers>();
		 repoUsers.findAll().forEach(list::add);
		 return list;
	 }
	
	public String checkLogin(String userId, String userPass) {
		String vstring=repoUsers.getCheckLogin(userId, userPass);		
		return vstring;
	}

	public List<ModelUserList> getUsersList (){
		return repoUsers.getUserList();
	}
	
	public Optional<ApplUsers> getUserById(String userId){
		 return repoUsers.findById(userId);	
	}
	
	public ApplUsers addUser (ApplUsers data) {
		 return repoUsers.save(data);
	 }
	
	 public void delUserById(String id) {	 
		 repoUsers.deleteById(id);
	 }

	 /*
	 public FullSchoolResponse findSchollWithStudent(Integer schoolId){

	 }
	  */

}
