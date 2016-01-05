package com.na.dao;

import com.na.entity.VoteDetail;

public interface VotedetailDao {

	public boolean insert(VoteDetail voteDetail);
	public boolean update(VoteDetail voteDetail);
	public boolean delete(VoteDetail voteDetail);
	public Object selectHql(String hql);
	public Object selectSql(String sql);
	public VoteDetail getVoteDetail(long id);
}
