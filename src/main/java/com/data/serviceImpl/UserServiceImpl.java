package com.data.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.entity.User;
import com.data.service.UserService;
import com.data.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao UserDao;
	
	@Override
	public int insertUser(User user) {
		UserDao.save(user);
		return 0;
	}

	@Override
	public List<User> findAll() {
		Iterable<User> findAll = UserDao.findAll();
		return (List<User>)UserDao.findAll();
	}

}
