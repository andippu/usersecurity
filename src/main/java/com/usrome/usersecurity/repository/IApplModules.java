package com.usrome.usersecurity.repository;

import com.usrome.usersecurity.model.ApplCoyOutlet;
import com.usrome.usersecurity.model.ApplModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplModules extends JpaRepository<ApplModules, Integer>{

}
