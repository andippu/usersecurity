package com.usrome.usersecurity.controller;

import com.usrome.usersecurity.model.VApplUserMenus;
import com.usrome.usersecurity.services.ServiceVUserMenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVUserMenus {
    @Autowired
    ServiceVUserMenus servVMenuUser;

    @GetMapping("/vusermenus/getmenuparent")
    public List<VApplUserMenus> getByParentUser(String userId, String moduleId, String parentId){
      return servVMenuUser.getByParentUsers(userId, moduleId, parentId);
    }

}
