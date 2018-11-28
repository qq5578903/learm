package com.jiuyu.im.entity;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 群组用户表
 * </p>
 *
 * @author duanlinfei
 * @since 2018-11-08
 */
@Data
@Accessors(chain = true)
@TableName("t_group_user")
public class GroupUser implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("群组用户ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("群组ID")
    @TableField("groupId")
    private Integer groupId;

    @ApiModelProperty("用户ID")
    @TableField("userId")
    private Integer userId;

    @ApiModelProperty("备注名ID")
    @TableField("remarkName")
    private String remarkName;

    @ApiModelProperty("创建时间ID")
    @TableField(value = "createAt", fill = FieldFill.INSERT)
    private Timestamp createAt;

    @ApiModelProperty("更新时间ID")
    @TableField(value = "updateAt", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateAt;


}
