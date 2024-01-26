package com.usrome.usersecurity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_USER_PARENTMENU")
@IdClass(VApplUserParentMenuCompKey.class)
public class VApplUserParentMenu {

    @Id
    @Column(name="VUSPAMN_USERID",length=30,  nullable = false)
    private String vuspamnUserId;

    @Id
    @Column(name="VUSPAMN_MODULEID",  nullable = false)
    private Integer vuspamnModuleId;

    @Column(name="VUSPAMN_PARENTID",length=100)
    private Integer vuspamnParentId;

    @Column(name="VUSPAMN_PARENTNAME",length=100)
    private String vuspamnParentName;
}
