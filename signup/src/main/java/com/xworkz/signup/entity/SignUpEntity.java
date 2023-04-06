package com.xworkz.signup.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="signup_table")
@NamedQuery(name = "find",query = "select ent from SignUpEntity ent")
@NamedQuery(name = "userId",query = "select count(*) from  SignUpEntity ent where ent.userId=:userBy")
@NamedQuery(name = "emailId",query = "select count(*) from  SignUpEntity ent where ent.email=:emailBy")
@NamedQuery(name = "mobileId",query = "select count(*) from  SignUpEntity ent where ent.mobile=:mobileBy")
@NamedQuery(name = "userANDpassword",query = "select ent from SignUpEntity ent where ent.userId=:ui")
@NamedQuery(name = "updateLoginCount",query = "update SignUpEntity ent set ent.loginCount=:count where ent.userId=:userId")
public class SignUpEntity extends AbstractAuditEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name ="userId")
	private String userId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "mobile")
	private long mobile;
	
	@Column(name = "password")
	private String password;

	@Column(name ="createdBy")
	private String createdBy;
	
	@Column(name = "createdDate")
	private LocalDateTime createdDate;
	
	@Column(name ="updatedBy")
	private String updatedBy;
	
	@Column(name ="updatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name ="logincount")
	private int loginCount;
}