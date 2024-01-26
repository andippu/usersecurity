package com.usrome.usersecurity.repository;

import com.usrome.usersecurity.model.ApplUserMenu;
import com.usrome.usersecurity.model.ApplUserMenusCompKey;
import com.usrome.usersecurity.model.VApplUserMenus;
import com.usrome.usersecurity.model.VApplUserMenusCompKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVApplUserMenus extends JpaRepository<VApplUserMenus, VApplUserMenusCompKey> {
    @Query(value = "select s from VApplUserMenus s where s.vusmnuUserId=?1 and s.vusmnuMenuModule=?2 and s.vusmnuMenuParent=?3")
    public List<VApplUserMenus> getByUserParent(String userId, String moduleId, String parentId);


}
