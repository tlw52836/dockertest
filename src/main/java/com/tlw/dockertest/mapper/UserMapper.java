package com.tlw.dockertest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tlw.dockertest.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
