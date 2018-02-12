package com.neo.dbtest.service;

import java.util.List;
import com.neo.dbtest.entity.UserEntity;
import com.neo.dbtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public String show(){
		return "hello,word!";
	}
	
	public List<UserEntity> showUsers(){
		return userMapper.getAll();
	}
	
	public String insert(String name,int age){
		UserEntity userEntity=new UserEntity();
		userEntity.setName(name);
		userEntity.setAge(age);
		userMapper.insert(userEntity);
		return "Insert ( \""+name+"\", age"+age+") OK!";
	}
	

}
