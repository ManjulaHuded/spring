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


@Entity
@Data
@Table(name ="signup_table")
@NamedQuery(name = "findAllEntity",query = "select ent from SignUpEntity ent")
@NamedQuery(name = "findByuserId",query = "select count(*) from  SignUpEntity ent where ent.userId=:userBy")
@NamedQuery(name = "findByEmailId",query = "select count(*) from  SignUpEntity ent where ent.email=:emailBy")
@NamedQuery(name = "findByMobileId",query = "select count(*) from  SignUpEntity ent where ent.mobile=:mobileBy")
@NamedQuery(name = "findByUserIdAndPassword",query = "select ent from SignUpEntity ent where ent.userId=:userIdBy")
@NamedQuery(name = "findByUpdateLoginCount",query = "update SignUpEntity ent set ent.loginCount=:count where ent.userId=:userId")
@NamedQuery(name="updatePassword", query = "update SignUpEntity ent set ent.password=:byPassword , ent.reSetPassword=:byResetPassword where ent.userId=:byUserId")
@NamedQuery(name="emailid",query = "select ent from SignUpEntity ent where ent.email=:ei")
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
	
	@Column(name = "resetPassword")
	private Boolean reSetPassword;
}