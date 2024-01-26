package com.usrome.usersecurity.repository;

import com.usrome.usersecurity.model.ApplUserMenu;
import com.usrome.usersecurity.model.ApplUserMenusCompKey;
import com.usrome.usersecurity.model.ApplUserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplUserMenusRepository  extends JpaRepository <ApplUserMenu, ApplUserMenusCompKey>{
    @Query(value = "select s from ApplUserMenu s where s.userMenusUserId=?1")
    public List<ApplUserMenu> findByUserId(String UserId);
}
