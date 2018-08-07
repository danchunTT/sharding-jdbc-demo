package com.lovet.shardingjdbcdemo.mapper;

import com.lovet.shardingjdbcdemo.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    void update(User user);

    void insert(User user);

}
