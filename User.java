package com.jiuyu.im.entity;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author duanlinfei
 * @since 2018-11-08
 */
@Data
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("用户ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("融云token")
    @TableField("rcToken")
    private String rcToken;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("昵称")
    @TableField("nickName")
    private String nickName;

    @ApiModelProperty("首字母")
    private String firstLetter;


    @ApiModelProperty("图像")
    private String avatar;

    @ApiModelProperty("密码")
    @JsonIgnore
    private String password;

    @ApiModelProperty("CYC用户ID")
    private String cycUserId;

    @ApiModelProperty("创建时间")
    @TableField(value = "createAt", fill = FieldFill.INSERT)
    private Timestamp createAt;

    @ApiModelProperty("更新时间")
    @TableField(value = "updateAt", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateAt;


    @ApiModelProperty("是否好友")
    private transient Boolean isFriend;


    @ApiModelProperty("备注名")
    private transient String remarkName;
}
