package com.na.entity;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Long id;
	private Activity activity;
	private Userinfo userinfo;
	private Timestamp createtime;
	private String content;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Long id, Userinfo userinfo, Timestamp createtime) {
		this.id = id;
		this.userinfo = userinfo;
		this.createtime = createtime;
	}

	/** full constructor */
	public Comment(Long id, Activity activity, Userinfo userinfo,
			Timestamp createtime, String content) {
		this.id = id;
		this.activity = activity;
		this.userinfo = userinfo;
		this.createtime = createtime;
		this.content = content;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}