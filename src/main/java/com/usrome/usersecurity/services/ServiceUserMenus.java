package com.usrome.usersecurity.services;


import com.usrome.usersecurity.model.ApplUserMenu;
import com.usrome.usersecurity.model.ApplUserRoles;
import com.usrome.usersecurity.repository.IApplUserMenusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUserMenus {
    @Autowired
    IApplUserMenusRepository repoUserMenus;

    public List<ApplUserMenu> getUserMenus (String userId){
        return repoUserMenus.findByUserId(userId);
    }

}
