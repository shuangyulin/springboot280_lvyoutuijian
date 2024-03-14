package com.entity.view;

import com.entity.JingdianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 景点留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jingdian_liuyan")
public class JingdianLiuyanView extends JingdianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jingdian
			/**
			* 景点名称
			*/
			private String jingdianName;
			/**
			* 景点类型
			*/
			private Integer jingdianTypes;
				/**
				* 景点类型的值
				*/
				private String jingdianValue;
			/**
			* 景点图片
			*/
			private String jingdianPhoto;
			/**
			* 景点门票
			*/
			private Double lvyouluxianMoney;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 景点详情
			*/
			private String jingdianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JingdianLiuyanView() {

	}

	public JingdianLiuyanView(JingdianLiuyanEntity jingdianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set jingdian
					/**
					* 获取： 景点名称
					*/
					public String getJingdianName() {
						return jingdianName;
					}
					/**
					* 设置： 景点名称
					*/
					public void setJingdianName(String jingdianName) {
						this.jingdianName = jingdianName;
					}
					/**
					* 获取： 景点类型
					*/
					public Integer getJingdianTypes() {
						return jingdianTypes;
					}
					/**
					* 设置： 景点类型
					*/
					public void setJingdianTypes(Integer jingdianTypes) {
						this.jingdianTypes = jingdianTypes;
					}


						/**
						* 获取： 景点类型的值
						*/
						public String getJingdianValue() {
							return jingdianValue;
						}
						/**
						* 设置： 景点类型的值
						*/
						public void setJingdianValue(String jingdianValue) {
							this.jingdianValue = jingdianValue;
						}
					/**
					* 获取： 景点图片
					*/
					public String getJingdianPhoto() {
						return jingdianPhoto;
					}
					/**
					* 设置： 景点图片
					*/
					public void setJingdianPhoto(String jingdianPhoto) {
						this.jingdianPhoto = jingdianPhoto;
					}
					/**
					* 获取： 景点门票
					*/
					public Double getLvyouluxianMoney() {
						return lvyouluxianMoney;
					}
					/**
					* 设置： 景点门票
					*/
					public void setLvyouluxianMoney(Double lvyouluxianMoney) {
						this.lvyouluxianMoney = lvyouluxianMoney;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 景点详情
					*/
					public String getJingdianContent() {
						return jingdianContent;
					}
					/**
					* 设置： 景点详情
					*/
					public void setJingdianContent(String jingdianContent) {
						this.jingdianContent = jingdianContent;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
