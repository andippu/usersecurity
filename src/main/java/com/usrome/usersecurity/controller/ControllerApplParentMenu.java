package com.usrome.usersecurity.controller;

import com.usrome.usersecurity.model.ApplParentMenu;
import com.usrome.usersecurity.services.ServiceApplParentMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerApplParentMenu {

    @Autowired
    ServiceApplParentMenu servParentmenu;

    @GetMapping("/parentmenu/getparentmenu")
    public List<ApplParentMenu> getParentMenu(Integer modId){
        return  servParentmenu.getParentMenu(modId);
    }

    @GetMapping("/parentmenu/getbyid")
    public List<ApplParentMenu> getByid(Integer modId){
        return servParentmenu.getById(modId);
    }
}
