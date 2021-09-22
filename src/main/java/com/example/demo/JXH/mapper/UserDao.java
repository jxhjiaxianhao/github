package com.example.demo.JXH.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * user mapper层接口
 */
@Mapper
public interface UserDao {
    /**
     * 接口中定义的变量都是public static的
     */
    public static String Java_HOME="123";

    @Select("select name from user where id=#{id}")
    String getName(@Param("id") Integer id);

    @Select("select * from user")
    List<Map<String,String>> getUserList();

}
