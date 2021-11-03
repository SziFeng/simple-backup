package com.maple.simple.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maple.simple.Vo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @DESCRIPTION:
 * @Author maple
 * @Date 2021/10/28
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {}
