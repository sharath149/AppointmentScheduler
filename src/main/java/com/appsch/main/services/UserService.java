package com.appsch.main.services;

import java.util.List;


import com.appsch.main.domain.Users;

public interface UserService {
	
	Users getUsersById(Long id);
	
	List<Users> getAllUsers();
	
	Users createUsers(Users users);
	
	Users updateUsers(Users users);
	
	void deleteUsers(Long id);

}
