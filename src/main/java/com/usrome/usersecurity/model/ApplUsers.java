package com.usrome.usersecurity.model;


import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPL_USERS")
public class ApplUsers {
	  
	  @Id
	  @Column(name="USER_ID",length=30,  nullable = false)
	  private String userId;
	  
	  @Column(name="USER_NAME",length=100,  nullable = false)
	  private String userName;
	  
	  @Column(name="USER_PASSWORD",length=30,  nullable = false)
	  private String userPass;
	  
	  @Column(name="USER_PERSON_ID")
	  private Integer userPersonId;

	  @Column(name="USER_START_DATE")
	  @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	  private Date userStartDate;
	  
	  @Column(name="USER_END_DATE")
	  @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	  private Date userEndDate;
	 
	  @Column(name="USER_DESCRIPTION",length=240)
	  private String userDescription;
	  
	  @Column(name="USER_LAST_LOGON")
	  @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	  private Date userLastLogon;
	  
	  @Column(name="USER_LAST_PASSWORD")
	  @JsonFormat(pattern="dd/MMM/yyyy HH:mm:ss")
	  private Date userLastPassword;
	  
	  @Column(name="USER_PASS_LIFESPAN")
	  private Integer userPassLifespan;  
	  
	  @Column(name="USER_PASS_NEED_CHG",length=1)
	  private String userPassNeedChg;
	  
	  @Column(name="USER_ENABLE_STS",length=1)
	  private String userEnableSts;
	  
	  @Column(name="USER_COYOUTLET",length=5)
	  private String userCoyOutlet;
	  
	  @Column(name="USER_CREATED_BY",length=30)
		public String userCreateBy;
		
		@Column(name="USER_CREATED")
		@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
		public Date userCreateDate;
		
		@Column(name="USER_UPDATE_BY")
		@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
		public String userUpdateBy;
		
		@Column(name="USER_UPDATED", length=30)
		public Date userUpdateDate;

}

