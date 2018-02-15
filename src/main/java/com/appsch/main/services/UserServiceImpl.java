 package com.appsch.main.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsch.main.dao.UserDAO;
import com.appsch.main.domain.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Users getUsersById(Long id) {
		return userDAO.findOne(id);
	}

	@Override
	public List<Users> getAllUsers() {
		return userDAO.findAll();
	}

	@Override
	public Users createUsers(Users users) {
		return userDAO.save(users);
	}

	@Override
	public Users updateUsers(Users users) {
		return userDAO.save(users);
	}

	@Override
	public void deleteUsers(Long id) {
		userDAO.delete(id);
	}

}
