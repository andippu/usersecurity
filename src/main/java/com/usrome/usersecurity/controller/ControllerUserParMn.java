package com.usrome.usersecurity.controller;

import com.usrome.usersecurity.model.VApplUserParentMenu;
import com.usrome.usersecurity.services.ServiceUserParMn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerUserParMn {
    @Autowired
    ServiceUserParMn servParMn;

    @GetMapping("/vparentmenu/getmenuparent")
    public List<VApplUserParentMenu> getUsParMenu(String userId, Integer modId){
        return servParMn.getUsParMenu(userId, modId);
    }
}
