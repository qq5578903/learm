package com.jiuyu.im.entity;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotations.Version;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 群组表
 * </p>
 *
 * @author duanlinfei
 * @since 2018-11-08
 */
@Data
@Accessors(chain = true)
@TableName("t_group")
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("群组ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("创建用户ID")
    @TableField("userId")
    private Integer userId;

    @ApiModelProperty("群组名称")
    private String name;

    @ApiModelProperty("图像")
    private String avatar;

    @ApiModelProperty("群人数")
    private Integer number;


    @ApiModelProperty("创建时间")
    @TableField(value = "createAt", fill = FieldFill.INSERT)
    private Timestamp createAt;

    @ApiModelProperty("更新时间")
    @TableField(value = "updateAt", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateAt;

    @ApiModelProperty("群用户列表")
    private transient List<User> userList;

    @ApiModelProperty("用户备注名")
    private transient String remarkName;
}
