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
@Table(name = "APPL_USERMENUS")
@IdClass(ApplUserMenusCompKey.class)
public class ApplUserMenu {
	
	 @Id
	 @Column(name="USER_ID",length=30,  nullable = false)
	 private String userMenusUserId;
	 
	@Id
	@Column (name="MODULE_ID" ,length=5, nullable = false)
	private Integer userMenuModulesId;
	 
	@Id
	@Column (name="MENU_ID" ,length=30, nullable = false)
	private String userMenuMenusId;
	
	@Column (name="USERMENU_MODE_ALLOWED" ,length=1)
	private String userMenuModeAllowed;
	
	@Column (name="USERMENU_DELETE_ALLOWED" ,length=1)
	private String userMenuDeleteAllowed;
	
	@Column (name="USERMENU_PRINT_ALLOWED" ,length=1)
	private String userMenuPrintAllowed;
	
	@Column (name="USERMENU_CREATED_BY",length=30)
	private String userMenuCreatedBy;
	
	@Column (name="USERMENU_UPDATED_BY",length=30)
	private String userMenuUpdatedBy;
	
	@Column (name="USERMENU_CREATED_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date userMenuCreatedDate;
	
	@Column (name="USERMENU_UPDATED_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date userMenuUpdatedDate;
	
	@Column (name="EFF_FROM_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date userMenuEffFromDate;
	
	@Column (name="EFF_TO_DATE")
	@JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	private Date userMenuEffToDate;
}
