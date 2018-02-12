package com.neo.dbtest.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import com.neo.dbtest.entity.UserEntity;

@Mapper
public interface UserMapper {
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="userName"),
		@Result(property="age",column="age")})
	@Select("SELECT * FROM users")
	List<UserEntity> getAll();
	
	@Insert("INSERT INTO users(userName,age) VALUES(#{name},#{age})")
	void insert(UserEntity userEntity);
}
