package com.na.entity;

/**
 * VoteDetail entity. @author MyEclipse Persistence Tools
 */

public class VoteDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private Long uid;
	private Long itemid;
	private Long voteid;

	// Constructors

	/** default constructor */
	public VoteDetail() {
	}

	/** full constructor */
	public VoteDetail(Long id, Long uid, Long itemid, Long voteid) {
		this.id = id;
		this.uid = uid;
		this.itemid = itemid;
		this.voteid = voteid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getVoteid() {
		return this.voteid;
	}

	public void setVoteid(Long voteid) {
		this.voteid = voteid;
	}

}