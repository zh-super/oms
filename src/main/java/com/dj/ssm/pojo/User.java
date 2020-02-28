package com.dj.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户表
 **/
@Data
@Accessors(chain = true)
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userName;

    private String userPhone;

    private String userEmail;

    private String user_pwd;

    private String Salt;

    /**
     * 管理员 维修员 普通用户
     */
    private Integer userDuty;

    /**
     * 1:男  2:女
     */
    private Integer userSex;

    private String userAddress;

    private Data createTime;

    private Data updateTime;

    /**
     * 1:未删除  0:已删除
     */
    private Integer isDel;

}
