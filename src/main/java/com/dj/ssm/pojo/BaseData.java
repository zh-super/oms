package com.dj.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 基础数据表
 **/
@Data
@Accessors(chain = true)
@TableName("base_data")
public class BaseData {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private String name;

    private Data createTime;

    private Data updateTime;

    /**
     * 1:未删除  0:已删除
     */
    private Integer isDel;

}
