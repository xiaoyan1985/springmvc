package com.zhao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhao.pojo.User;
import com.zhao.pojo.UserExample;

public interface UserMapper {
	List<User> selectByExample(UserExample example);//查找所有數據
	User selectByPrimaryKey(Integer iduser);//通過主鍵獲取數據
	int updateByPrimaryKey(User record);//通過主鍵更改數據
	int deleteByPrimaryKey(Integer iduser);//通過主鍵更改數據字典
	int insert(User record);//增加數據
	int maxPrimaryKey();//查找最大ID
}