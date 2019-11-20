package com.study.badoupo.service.impl;

import com.study.badoupo.entity.User;
import com.study.badoupo.mapper.UserMapper;
import com.study.badoupo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author badoupo
 * @since 2019-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
