package com.usrome.usersecurity.repository;
import com.usrome.usersecurity.model.ApplParentMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IApplParentMenuRepository extends JpaRepository<ApplParentMenu, Integer>{
    @Query("select s from ApplParentMenu s where s.parentMenuModId=?1")
    public List<ApplParentMenu> getByModId(Integer modId);
}
