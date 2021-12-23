package com.caffeineshawn.db_backend.service;

import com.caffeineshawn.db_backend.entity.QueryInfo;
import com.caffeineshawn.db_backend.entity.User;
import com.caffeineshawn.db_backend.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User findUserById(int user_id){
        return userMapper.findUserById(user_id);
    }

    public List<User> findAllUser(QueryInfo queryInfo){
        queryInfo.setPage((queryInfo.getPage() - 1) * queryInfo.getSize());
        return userMapper.findAllUser(queryInfo);
    }

    public int findAllUserCount(QueryInfo queryInfo){
        return userMapper.findAllUserCount(queryInfo.getInformation());
    }
}
