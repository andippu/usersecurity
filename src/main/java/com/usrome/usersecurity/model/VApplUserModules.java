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
@Table(name= "V_APPL_USERMODULE")
public class VApplUserModules {

    @Id
    @Column(name="VAUSMOD_ID" ,length=6, nullable = false)
    private String vausmodId;

    @Column (name="VAUSMOD_USERID", length=30)
    private String vausmodUserId;

    @Column (name="VAUSMOD_MODULEID")
    private Integer vausmodModuleId;

    @Column (name="VAUSMOD_MODULENAME", length=50)
    private String vausmodModuleName;

    @Column (name="VAUSMOD_ICON", length=20)
    private String vausmodIcon;

    @Column (name="VAUSMOD_ROUTE", length=80)
    private String vausmodRoute;
}
