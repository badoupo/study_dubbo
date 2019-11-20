package com.study.badoupo.service.impl;

import com.study.badoupo.api.IUserApi;
import com.study.badoupo.res.UserResDto;
import com.study.badoupo.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<UserResDto> list() {
        List<UserResDto> result = userApi.list();
        return result;
    }
}
