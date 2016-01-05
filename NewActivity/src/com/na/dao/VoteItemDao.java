package com.na.dao;
import com.na.entity.VoteItem;

public interface VoteItemDao {

	public boolean insert(VoteItem voteItem);
	public boolean update(VoteItem voteItem);
	public boolean delete(VoteItem voteItem);
	public Object selectHql(String hql);
	public Object selectSql(String sql);
	
}
