package com.na.entity;

/**
 * VoteItem entity. @author MyEclipse Persistence Tools
 */

public class VoteItem implements java.io.Serializable {

	// Fields

	private Long id;
	private Vote vote;
	private String description;
	private Long otherid;

	// Constructors

	/** default constructor */
	public VoteItem() {
	}

	/** minimal constructor */
	public VoteItem(Long id, Vote vote) {
		this.id = id;
		this.vote = vote;
	}

	/** full constructor */
	public VoteItem(Long id, Vote vote, String description, Long otherid) {
		this.id = id;
		this.vote = vote;
		this.description = description;
		this.otherid = otherid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vote getVote() {
		return this.vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOtherid() {
		return this.otherid;
	}

	public void setOtherid(Long otherid) {
		this.otherid = otherid;
	}

}