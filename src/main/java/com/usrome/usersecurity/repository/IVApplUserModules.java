package com.usrome.usersecurity.repository;


import com.usrome.usersecurity.model.VApplUserModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVApplUserModules extends JpaRepository<VApplUserModules, String> {
    @Query("select s from VApplUserModules s where s.vausmodUserId =?1")
    public List<VApplUserModules> getByUserId(String UserId);
}
