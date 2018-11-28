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
 * 好友表
 * </p>
 *
 * @author duanlinfei
 * @since 2018-11-08
 */
@Data
@Accessors(chain = true)
@TableName("t_friend")
public class Friend implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("好友ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户ID")
    @TableField("userId")
    private Integer userId;

    @ApiModelProperty("好友用户ID")
    @TableField("friendUserId")
    private Integer friendUserId;

    @ApiModelProperty("首字母")
    @TableField("firstLetter")
    private String firstLetter;

    @ApiModelProperty("备注名")
    @TableField("remarkName")
    private String remarkName;

    @ApiModelProperty("创建时间")
    @TableField(value = "createAt", fill = FieldFill.INSERT)
    private Timestamp createAt;

    @ApiModelProperty("更新时间")
    @TableField(value = "updateAt", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateAt;


}
