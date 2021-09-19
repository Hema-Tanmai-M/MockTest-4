package com.ibm.training.spring.boot.mongodb.api;

import org.springframework.web.bind.annotation.AppController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation..Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@AppController
@RequestMapping(value="/users")


public class UserResource {
	
	@Autowired
	private UsersService usersservice;
	
	@PostMapping
	public Users addUsers(@RequestBody Users users)
	{
		return usersservice.addUsers(usersservice);
	}

}
