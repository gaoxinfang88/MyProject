package com.na.dao;

import com.na.entity.PCP;

public interface PCPDao {

	public boolean insert(PCP pcp);
	public boolean update(PCP pcp);
	public boolean delete(PCP pcp);
	public Object selectHql(String hql);
	public Object selectSql(String sql);
	public boolean otherHql(String hql);
	public boolean otherSql(String sql);
	public PCP getPcp(long id);
}
