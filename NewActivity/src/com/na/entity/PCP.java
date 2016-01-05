package com.na.entity;

/**
 * PCP entity. @author MyEclipse Persistence Tools
 */

public class PCP implements java.io.Serializable {

	// Fields

	private Long id;
	private Activity activity;
	private Userinfo userinfo;
	private Integer groupid;

	// Constructors

	/** default constructor */
	public PCP() {
	}

	/** minimal constructor */
	public PCP(Long id) {
		this.id = id;
	}

	/** full constructor */
	public PCP(Long id, Activity activity, Userinfo userinfo, Integer groupid) {
		this.id = id;
		this.activity = activity;
		this.userinfo = userinfo;
		this.groupid = groupid;
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

	public Integer getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

}