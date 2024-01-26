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
@Table(name = "APPL_ROLEMENUS")
@IdClass(ApplRoleMenuCompKey.class)
public class ApplRoleMenu {
	
	@Id
	@Column (name="ROLE_ID",length=8,  nullable = false)
	private Integer roleMenuRoleId;
	
	@Id
	@Column (name="MODULE_ID" ,length=5, nullable = false)
	private Integer roleMenuModulesId;
	
	@Id
	@Column (name="MENU_ID" ,length=30, nullable = false)
	private String roleMenuMenusId;
	
	@Column (name="ROLEMENU_MODE_ALLOWED" ,length=1)
	private String roleMenuModeAllowed;
	
	@Column (name="ROLEMENU_DELETE_ALLOWED" ,length=1)
	private String roleMenuDeleteAllowed;
	
	@Column (name="ROLEMENU_PRINT_ALLOWED" ,length=1)
	private String roleMenuPrintAllowed;
	
	@Column (name="ROLEMENU_CREATED_BY",length=30)
	private String roleMenuCreatedBy;
	
	@Column (name="ROLEMENU_UPDATED_BY",length=30)
	private String roleMenuUpdatedBy;
	
	@Column (name="ROLEMENU_CREATED_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date roleMenuCreatedDate;
	
	@Column (name="ROLEMENU_UPDATED_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date roleMenuUpdatedDate;


}
