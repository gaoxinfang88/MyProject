package com.na.dao;

import com.na.entity.Vote;

public interface VoteDao {

	public boolean insert(Vote vote);
	public boolean update(Vote vote);
	public boolean delete(Vote vote);
	public Object selectHql(String hql);
	public Object selectSql(String sql);
	public boolean otherHql(String hql);
	public boolean otherSql(String sql);
	public Vote getVote(long id);
}
