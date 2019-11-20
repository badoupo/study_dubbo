package com.study.badoupo.controller;


import com.study.badoupo.ResultDto;
import com.study.badoupo.api.IUserApi;
import com.study.badoupo.entity.User;
import com.study.badoupo.res.UserResDto;
import com.study.badoupo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author badoupo
 * @since 2019-08-01
 */
@RestController
@RequestMapping("/badoupo/user")
public class UserController extends BaseController {
    @Autowired
    private IUserApi userApi;

    @PostMapping(path = "/list")
    public ResultDto<List<UserResDto>> getList() {
        List<UserResDto> result = userApi.list();
        return ResultDto.ok(result);
    }
}
