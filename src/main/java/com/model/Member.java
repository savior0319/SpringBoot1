package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "MEMBER")
public class Member {

	@Id
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "USER_PWD")
	private String userPwd;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "AGE")
	private int age;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_DATE")
	private Date insertDate;
	@Column(name = "USE_YN", columnDefinition = "NUMBER DEFAULT 1")
	private int useYn;
	
	
}
