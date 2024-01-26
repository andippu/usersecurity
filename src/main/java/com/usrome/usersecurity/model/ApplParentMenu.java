package com.usrome.usersecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "APPL_PARENTMENU")
public class ApplParentMenu {

    @Id
    @Column(name="PARENTMENU_ID" , nullable = false)
    private Integer parentMenuId;

    @Column (name="PARENTMENU_NAME", length=20)
    private String parentMenuName;

    @Column (name="PARENTMENU_ICON", length=20)
    private String parentMenuICon;

    @Column (name="PARENTMENU_MODULE_ID" )
    private Integer parentMenuModId;

}
