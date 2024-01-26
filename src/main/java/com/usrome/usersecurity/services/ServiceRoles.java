package com.usrome.usersecurity.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usrome.usersecurity.model.ApplRoles;
import com.usrome.usersecurity.model.ApplUserRoles;
import com.usrome.usersecurity.repository.IApplRolesRepository;



@Service
public class ServiceRoles {
	@Autowired
	IApplRolesRepository repoRoles;

	public String getRoleName(Integer roleId) {
		return repoRoles.getRoleNames(roleId);
	}
	
	


}
