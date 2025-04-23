package com.entity.vo;

import com.entity.TongxunluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通讯录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tongxunlu")
public class TongxunluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
