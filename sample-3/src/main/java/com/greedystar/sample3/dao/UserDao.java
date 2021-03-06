package com.greedystar.sample3.dao;

import com.greedystar.sample3.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2020-06-11
 */
@Mapper
@Component
public interface UserDao {

    public User get(String id);

    public User getByPhone(String phone);

    public List<User> findList(User user);

    public List<User> findAllList();

    public int insert(User user);

    public int insertBatch(List<User> users);

    public int update(User user);

    public int delete(User user);

}