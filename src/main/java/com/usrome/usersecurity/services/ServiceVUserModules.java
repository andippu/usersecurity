package com.usrome.usersecurity.services;

import com.usrome.usersecurity.model.VApplUserModules;
import com.usrome.usersecurity.repository.IApplUsersRepository;
import com.usrome.usersecurity.repository.IVApplUserModules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVUserModules {
    @Autowired
    IVApplUserModules repoUserMods;

    public List<VApplUserModules> getByUserId (String userId ){
        return repoUserMods.getByUserId(userId);

    }

}
