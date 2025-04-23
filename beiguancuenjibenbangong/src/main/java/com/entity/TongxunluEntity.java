package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 通讯录
 *
 * @author 
 * @email
 */
@TableName("tongxunlu")
public class TongxunluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TongxunluEntity() {

	}

	public TongxunluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 名称
     */
    @TableField(value = "tongxunlu_name")

    private String tongxunluName;


    /**
     * 备注
     */
    @TableField(value = "tongxunlu_beizhu")

    private String tongxunluBeizhu;


    /**
     * 联系方式
     */
    @TableField(value = "tongxunlu_phone")

    private String tongxunluPhone;


    /**
     * 类型
     */
    @TableField(value = "tongxunlu_types")

    private Integer tongxunluTypes;


    /**
     * 添加日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getTongxunluName() {
        return tongxunluName;
    }
    /**
	 * 获取：名称
	 */

    public void setTongxunluName(String tongxunluName) {
        this.tongxunluName = tongxunluName;
    }
    /**
	 * 设置：备注
	 */
    public String getTongxunluBeizhu() {
        return tongxunluBeizhu;
    }
    /**
	 * 获取：备注
	 */

    public void setTongxunluBeizhu(String tongxunluBeizhu) {
        this.tongxunluBeizhu = tongxunluBeizhu;
    }
    /**
	 * 设置：联系方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 设置：类型
	 */
    public Integer getTongxunluTypes() {
        return tongxunluTypes;
    }
    /**
	 * 获取：类型
	 */

    public void setTongxunluTypes(Integer tongxunluTypes) {
        this.tongxunluTypes = tongxunluTypes;
    }
    /**
	 * 设置：添加日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tongxunlu{" +
            "id=" + id +
            ", tongxunluName=" + tongxunluName +
            ", tongxunluBeizhu=" + tongxunluBeizhu +
            ", tongxunluPhone=" + tongxunluPhone +
            ", tongxunluTypes=" + tongxunluTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
