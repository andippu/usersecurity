package com.usrome.usersecurity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_APPL_USERMENUS")
@IdClass(VApplUserMenusCompKey.class)
public class VApplUserMenus {
    @Id
    @Column(name="VUSMENU_USERID",length=30,  nullable = false)
    private String vusmnuUserId;

    @Id
    @Column(name="VUSMENU_MENUID",length=30,  nullable = false)
    private String vusmnuMenuid;

    @Column(name="VUSMENU_MENUNAME",length=100)
    private String vusmnuMenuName;

    @Column(name="VUSMENU_FILENAME",length=100)
    private String vusmnuFileMenu;

    @Column(name="VUSMENU_PARENT")
    private Integer vusmnuMenuParent;

    @Column(name="VUSMENU_MODULE",length=30,  nullable = false)
    private Integer vusmnuMenuModule;



}
