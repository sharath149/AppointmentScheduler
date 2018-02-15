package com.appsch.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appsch.main.domain.Users;
import com.appsch.main.services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
	public ResponseEntity<Users> getUsersById(@PathVariable final Long id){
		Users users = userService.getUsersById(id);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Users>> getAllUsers(){
		List<Users> users = userService.getAllUsers();
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> createUsers(@RequestBody final Users users){
		Users usersCreate = userService.createUsers(users);
		return new ResponseEntity<Users>(usersCreate, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> updateUsers(@PathVariable final Long id, @RequestBody final Users users){
		Users usersUpdate = userService.updateUsers(users);
		return new ResponseEntity<Users>(usersUpdate, HttpStatus.OK);
	}
}
