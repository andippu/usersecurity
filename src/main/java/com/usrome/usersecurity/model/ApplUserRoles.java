package com.usrome.usersecurity.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPL_USERROLES")
@IdClass(ApplUserRolesCompKey.class)
public class ApplUserRoles {
	   
	
	@Id
	@Column (name="USER_ID",length=30,  nullable = false)
	private String userId;
	
	@Id
	@Column (name="ROLE_ID",length=8,  nullable = false)
	private Integer roleId;
	
	@Column (name="CREATED_BY", length=30)
    private String createdBy;
	
	@Column (name="CREATED_DATE")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date createDate;
	
	@Column (name="UPDATED_BY", length=30)
    private String updatedBy;
	
	@Column (name="UPDATED_DATE")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date updatedDate;
	
	@Column (name="EFF_FROM_DATE",  updatable = false)
	@JsonFormat(pattern="MM/dd/yyyy")
    private Date effFromDate;
	
	@Column (name="EFF_TO_DATE",  updatable = false)
	@JsonFormat(pattern="MM/dd/yy")
    private Date effToDate;
	
}
