package com.study.badoupo.controller;


import com.study.badoupo.ResultDto;
import com.study.badoupo.api.IUserApi;
import com.study.badoupo.res.UserResDto;
import com.study.badoupo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户管理接口
 * </p>
 *
 * @author badoupo
 * @since 2019-08-01
 */
@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "获取用户列表")
    @PostMapping(path = "/list")
    public ResultDto<List<UserResDto>> getList() {
        List<UserResDto> result = userService.list();
        return ResultDto.ok(result);
    }
}
