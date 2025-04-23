package com.entity.view;

import com.entity.RichengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 日程信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("richeng")
public class RichengView extends RichengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 日程类型的值
		*/
		private String richengValue;



	public RichengView() {

	}

	public RichengView(RichengEntity richengEntity) {
		try {
			BeanUtils.copyProperties(this, richengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 日程类型的值
			*/
			public String getRichengValue() {
				return richengValue;
			}
			/**
			* 设置： 日程类型的值
			*/
			public void setRichengValue(String richengValue) {
				this.richengValue = richengValue;
			}









}
