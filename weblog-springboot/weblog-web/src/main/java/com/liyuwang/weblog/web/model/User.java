package com.liyuwang.weblog.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.management.MXBean;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@ApiModel("用户实体类")
public class User {
    // 用户名
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String userName;
    // 年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 1, message = "年龄不能 <= 0")
    @Max(value = 110, message = "年龄不能大于110")
    @ApiModelProperty(value = "年龄", required = true)
    private Integer age;

    //性别
    @NotNull(message = "性别不能为空")
    @ApiModelProperty(value = "性别", required = true)
    private Integer sex;

    //邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确") // 确保邮箱格式正确
    @ApiModelProperty(value = "邮箱", required = true)
    private String email;

    // 创建时间
    private LocalDateTime createTime;
    // 更新日期
    private LocalDate updateDate;
    // 时间
    private LocalTime time;
}