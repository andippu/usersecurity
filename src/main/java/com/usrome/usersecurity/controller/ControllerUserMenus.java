package com.usrome.usersecurity.controller;

import com.usrome.usersecurity.model.ApplUserMenu;
import com.usrome.usersecurity.model.ApplUserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usrome.usersecurity.services.ServiceUserMenus;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerUserMenus {

    @Autowired
    ServiceUserMenus serviceUserMenu;

    @GetMapping("/usermenus/getusermenus")
    public List<ApplUserMenu> getUserMenu(String userId){
        return serviceUserMenu.getUserMenus(userId);
    }

}
