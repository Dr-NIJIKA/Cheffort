package com.itlsc.mapper;

import com.itlsc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    public User getUserByName(String username);
}
