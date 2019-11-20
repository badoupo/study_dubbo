package com.study.badoupo.api;

import com.study.badoupo.entity.User;
import com.study.badoupo.res.UserResDto;
import com.study.badoupo.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserApi implements IUserApi {
    @Autowired
    private IUserService userService;

    @Override
    public List<UserResDto> list() {
        List<User> list = userService.list();
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        List<UserResDto> resDtoList = new ArrayList<>(list.size());
        list.forEach(user -> {
            UserResDto userResDto = new UserResDto();
            BeanUtils.copyProperties(user, userResDto);
            resDtoList.add(userResDto);
        });
        return resDtoList;
    }
}
