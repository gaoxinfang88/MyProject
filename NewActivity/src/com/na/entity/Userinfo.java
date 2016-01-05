package com.na.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Long uid;
	private Integer authority;
	private Float height;
	private Float weight;
	private Integer age;
	private Integer sex;
	private Integer phonenumber;
	private String email;
	private Set comments = new HashSet(0);
	private Set PCPs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(Integer authority) {
		this.authority = authority;
	}

	/** full constructor */
	public Userinfo(Integer authority, Float height, Float weight, Integer age,
			Integer sex, Integer phonenumber, String email, Set comments,
			Set PCPs) {
		this.authority = authority;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.phonenumber = phonenumber;
		this.email = email;
		this.comments = comments;
		this.PCPs = PCPs;
	}

	// Property accessors

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Integer getAuthority() {
		return this.authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getPCPs() {
		return this.PCPs;
	}

	public void setPCPs(Set PCPs) {
		this.PCPs = PCPs;
	}

}