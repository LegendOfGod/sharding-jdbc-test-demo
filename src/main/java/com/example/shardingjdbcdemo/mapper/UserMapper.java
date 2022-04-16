package com.example.shardingjdbcdemo.mapper;

import com.example.shardingjdbcdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lqb
 * @date 2022/4/15 22:04
 */
@Mapper
public interface UserMapper {
    int insertTable(User user);

    int deleteTableById(Long id);

    int updateTableById(@Param("id") Long id, @Param("name") String name);

    List<User> listAllTable();
}
