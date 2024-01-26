package com.usrome.usersecurity.services;

import com.usrome.usersecurity.model.VApplUserParentMenu;
import com.usrome.usersecurity.repository.IVApplUserParentMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUserParMn {
    @Autowired
    IVApplUserParentMenu repoParMenu;

    public List<VApplUserParentMenu> getUsParMenu(String userId, Integer modId){
        return repoParMenu.getParMnUser(userId, modId);
    }
}
