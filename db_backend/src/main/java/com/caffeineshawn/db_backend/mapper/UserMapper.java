package com.caffeineshawn.db_backend.mapper;


import com.caffeineshawn.db_backend.entity.QueryInfo;
import com.caffeineshawn.db_backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User findUserById(int user_id);

    List<User> findAllUser(QueryInfo queryInfo);

    List<User> findUsers();

    int findAllUserCount(String information);

    User findUserByNameAndPhone(User user);

    int addUser(User user);
}
