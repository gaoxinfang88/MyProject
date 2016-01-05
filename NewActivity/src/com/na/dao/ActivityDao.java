package com.na.dao;

import com.na.entity.Activity;

public interface ActivityDao {
	public boolean insert(Activity activity);
	public boolean update(Activity activity);
	public boolean delete(Activity activity);
	public Object selectHql(String hql);
	public Object selectSql(String sql);
	public boolean otherHql(String hql);
	public boolean otherSql(String sql);
	public Activity getActivity(long id);
}
