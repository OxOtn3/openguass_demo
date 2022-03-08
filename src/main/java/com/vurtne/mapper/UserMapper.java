package com.vurtne.mapper;

import com.vurtne.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author oxotn3
 * @create 2022-03-08
 * @description
 */
@Mapper
public interface UserMapper {
    List<User> getUser();
}
