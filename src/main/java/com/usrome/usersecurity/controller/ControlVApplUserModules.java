package com.usrome.usersecurity.controller;

import com.usrome.usersecurity.model.VApplUserModules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usrome.usersecurity.services.ServiceVUserModules;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControlVApplUserModules {
    @Autowired
    ServiceVUserModules serviceVUserMods;

    @GetMapping("/usermodule/getusermodules")
    public List<VApplUserModules> getByUserId (String userId ){
        return serviceVUserMods.getByUserId(userId);

    }

}
