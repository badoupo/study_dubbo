package com.study.badoupo.res;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResDto {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 状态（0：可用，不可用）
     */
    private String status;

    /**
     * 性别（1：男，2：女）
     */
    private String sex;

    /**
     * 删除标识（0：未删除，1：已删除）
     */
    private Boolean deleted;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;
}
