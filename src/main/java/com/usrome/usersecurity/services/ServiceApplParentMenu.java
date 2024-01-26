package com.usrome.usersecurity.services;

import com.usrome.usersecurity.model.ApplParentMenu;
import com.usrome.usersecurity.repository.IApplParentMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceApplParentMenu {
    @Autowired
    IApplParentMenuRepository repoParentMenu;

    public List<ApplParentMenu> getParentMenu(Integer modId){
        return repoParentMenu.getByModId(modId);
    }

    public List<ApplParentMenu> getById(Integer modId){
        return repoParentMenu.findAll();
    }

}
