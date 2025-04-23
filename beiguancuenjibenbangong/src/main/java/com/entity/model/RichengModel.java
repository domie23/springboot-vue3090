package com.entity.model;

import com.entity.RichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 日程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RichengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String richengName;


    /**
     * 日程类型
     */
    private Integer richengTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date richengTime;


    /**
     * 日程详情
     */
    private String kaoqinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getRichengName() {
        return richengName;
    }


    /**
	 * 设置：标题
	 */
    public void setRichengName(String richengName) {
        this.richengName = richengName;
    }
    /**
	 * 获取：日程类型
	 */
    public Integer getRichengTypes() {
        return richengTypes;
    }


    /**
	 * 设置：日程类型
	 */
    public void setRichengTypes(Integer richengTypes) {
        this.richengTypes = richengTypes;
    }
    /**
	 * 获取：日期
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 设置：日期
	 */
    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
    }
    /**
	 * 获取：日程详情
	 */
    public String getKaoqinContent() {
        return kaoqinContent;
    }


    /**
	 * 设置：日程详情
	 */
    public void setKaoqinContent(String kaoqinContent) {
        this.kaoqinContent = kaoqinContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
