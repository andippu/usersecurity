package com.usrome.usersecurity.repository;

import com.usrome.usersecurity.model.VApplUserParentMenu;
import com.usrome.usersecurity.model.VApplUserParentMenuCompKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVApplUserParentMenu  extends JpaRepository<VApplUserParentMenu, VApplUserParentMenuCompKey> {
    @Query(value = "select s from VApplUserParentMenu s where s.vuspamnUserId=?1 and s.vuspamnModuleId=?2")
    public List<VApplUserParentMenu> getParMnUser (String userId, Integer modId);

}
