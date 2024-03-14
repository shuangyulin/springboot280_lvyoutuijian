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
 * 景点信息
 *
 * @author 
 * @email
 */
@TableName("jingdian")
public class JingdianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianEntity() {

	}

	public JingdianEntity(T t) {
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
     * 景点名称
     */
    @TableField(value = "jingdian_name")

    private String jingdianName;


    /**
     * 景点类型
     */
    @TableField(value = "jingdian_types")

    private Integer jingdianTypes;


    /**
     * 景点图片
     */
    @TableField(value = "jingdian_photo")

    private String jingdianPhoto;


    /**
     * 景点门票
     */
    @TableField(value = "lvyouluxian_money")

    private Double lvyouluxianMoney;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 景点详情
     */
    @TableField(value = "jingdian_content")

    private String jingdianContent;


    /**
     * 发布时间
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
	 * 设置：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名称
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点图片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点图片
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点门票
	 */
    public Double getLvyouluxianMoney() {
        return lvyouluxianMoney;
    }


    /**
	 * 获取：景点门票
	 */

    public void setLvyouluxianMoney(Double lvyouluxianMoney) {
        this.lvyouluxianMoney = lvyouluxianMoney;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：景点详情
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
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
        return "Jingdian{" +
            "id=" + id +
            ", jingdianName=" + jingdianName +
            ", jingdianTypes=" + jingdianTypes +
            ", jingdianPhoto=" + jingdianPhoto +
            ", lvyouluxianMoney=" + lvyouluxianMoney +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", jingdianContent=" + jingdianContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
