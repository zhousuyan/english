package com.neo.dbtest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.neo.dbtest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/show")
	public String show(){
		return userService.show();
	}

	@RequestMapping(value = "/showUsers")
	public Object showUsers(){
		return userService.showUsers();
	}
	
	@RequestMapping(value = "/insert")
	public String insert(String name,int age){
		return userService.insert(name, age);
	}
	
}
