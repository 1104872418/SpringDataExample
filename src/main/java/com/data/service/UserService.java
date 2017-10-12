package com.data.service;

import java.util.List;

import com.data.entity.User;

public interface UserService {

	/**
	 * 插入
	* @Title: insertUser
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @author Mr.Dong
	* @date  2017年10月12日 上午10:42:56
	* @param user
	* @return
	 */
	int insertUser(User user);
	
	/**
	 * 查询所有
	* @Title: findAll
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @author Mr.Dong
	* @date  2017年10月12日 上午10:43:08
	* @return
	 */
	List<User> findAll();
}
