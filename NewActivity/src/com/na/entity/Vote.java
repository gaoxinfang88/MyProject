package com.na.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */

public class Vote implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private Integer type;
	private Long manager;
	private Set voteItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** minimal constructor */
	public Vote(Long id, String title) {
		this.id = id;
		this.title = title;
	}

	/** full constructor */
	public Vote(Long id, String title, Integer type, Long manager, Set voteItems) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.manager = manager;
		this.voteItems = voteItems;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getManager() {
		return this.manager;
	}

	public void setManager(Long manager) {
		this.manager = manager;
	}

	public Set getVoteItems() {
		return this.voteItems;
	}

	public void setVoteItems(Set voteItems) {
		this.voteItems = voteItems;
	}

}