package com.usrome.usersecurity.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ApplUserRolesCompKey implements Serializable {
	
	private String userId;
	private Integer roleId;
}
