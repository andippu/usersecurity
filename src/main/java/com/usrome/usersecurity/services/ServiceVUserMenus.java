package com.usrome.usersecurity.services;

import com.usrome.usersecurity.model.VApplUserMenus;
import com.usrome.usersecurity.repository.IVApplUserMenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVUserMenus {
    @Autowired
    IVApplUserMenus repoVUserMenu;

    public List<VApplUserMenus> getByParentUsers(String userId, String moduleId, String parentId){
        return repoVUserMenu.getByUserParent(userId, moduleId, parentId);
    }
}
