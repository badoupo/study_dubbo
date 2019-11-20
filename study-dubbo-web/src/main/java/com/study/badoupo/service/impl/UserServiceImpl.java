package com.study.badoupo.service.impl;

import com.study.badoupo.api.IUserApi;
import com.study.badoupo.res.UserResDto;
import com.study.badoupo.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author badoupo
 * @since 2019-08-01
 */
@Service
public class UserServiceImpl implements IUserService {
    @Reference
    private IUserApi userApi;
    ReentrantLock lock;

    @Override
    public List<UserResDto> list() {
        return userApi.list();
    }
}
