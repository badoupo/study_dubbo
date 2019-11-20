package com.study.badoupo.api;

import com.study.badoupo.res.UserResDto;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author badoupo
 * @since 2019-08-01
 */
public interface IUserApi {
    List<UserResDto> list();
}
