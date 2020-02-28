package com.dj.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 维修状况表
 **/
@Data
@Accessors(chain = true)
@TableName("oms")
public class OMS {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String errorDes;

    /**
     * 申请状态
     */
    private Integer status;

    private Data createTime;

    private Data updateTime;

    /**
     * 1:未删除  0:已删除
     */
    private Integer isDel;

}
