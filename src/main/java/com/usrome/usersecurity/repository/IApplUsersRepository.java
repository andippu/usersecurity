package com.usrome.usersecurity.repository;

import com.usrome.usersecurity.model.ModelUserList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.usrome.usersecurity.model.ApplUsers;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplUsersRepository extends JpaRepository<ApplUsers, String>{
	

	@Procedure(procedureName = "P_GX_CHECK_LOGIN")
	public String getCheckLogin(String userId, String userPass);

	@Query(value = "select s from ApplUsers s")
	public List<ModelUserList> getUserList();

}
