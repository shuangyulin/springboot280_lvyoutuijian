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
 * 旅游路线
 *
 * @author 
 * @email
 */
@TableName("lvyouluxian")
public class LvyouluxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvyouluxianEntity() {

	}

	public LvyouluxianEntity(T t) {
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
     * 路线编号
     */
    @TableField(value = "lvyouluxian_uuid_number")

    private String lvyouluxianUuidNumber;


    /**
     * 路线标题
     */
    @TableField(value = "lvyouluxian_name")

    private String lvyouluxianName;


    /**
     * 路线类型
     */
    @TableField(value = "lvyouluxian_types")

    private Integer lvyouluxianTypes;


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
     * 路线预算
     */
    @TableField(value = "lvyouluxian_money")

    private Double lvyouluxianMoney;


    /**
     * 路线图片
     */
    @TableField(value = "lvyouluxian_photo")

    private String lvyouluxianPhoto;


    /**
     * 路线详情
     */
    @TableField(value = "lvyouluxian_content")

    private String lvyouluxianContent;


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
	 * 设置：路线编号
	 */
    public String getLvyouluxianUuidNumber() {
        return lvyouluxianUuidNumber;
    }


    /**
	 * 获取：路线编号
	 */

    public void setLvyouluxianUuidNumber(String lvyouluxianUuidNumber) {
        this.lvyouluxianUuidNumber = lvyouluxianUuidNumber;
    }
    /**
	 * 设置：路线标题
	 */
    public String getLvyouluxianName() {
        return lvyouluxianName;
    }


    /**
	 * 获取：路线标题
	 */

    public void setLvyouluxianName(String lvyouluxianName) {
        this.lvyouluxianName = lvyouluxianName;
    }
    /**
	 * 设置：路线类型
	 */
    public Integer getLvyouluxianTypes() {
        return lvyouluxianTypes;
    }


    /**
	 * 获取：路线类型
	 */

    public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
        this.lvyouluxianTypes = lvyouluxianTypes;
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
	 * 设置：路线预算
	 */
    public Double getLvyouluxianMoney() {
        return lvyouluxianMoney;
    }


    /**
	 * 获取：路线预算
	 */

    public void setLvyouluxianMoney(Double lvyouluxianMoney) {
        this.lvyouluxianMoney = lvyouluxianMoney;
    }
    /**
	 * 设置：路线图片
	 */
    public String getLvyouluxianPhoto() {
        return lvyouluxianPhoto;
    }


    /**
	 * 获取：路线图片
	 */

    public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
        this.lvyouluxianPhoto = lvyouluxianPhoto;
    }
    /**
	 * 设置：路线详情
	 */
    public String getLvyouluxianContent() {
        return lvyouluxianContent;
    }


    /**
	 * 获取：路线详情
	 */

    public void setLvyouluxianContent(String lvyouluxianContent) {
        this.lvyouluxianContent = lvyouluxianContent;
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
        return "Lvyouluxian{" +
            "id=" + id +
            ", lvyouluxianUuidNumber=" + lvyouluxianUuidNumber +
            ", lvyouluxianName=" + lvyouluxianName +
            ", lvyouluxianTypes=" + lvyouluxianTypes +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", lvyouluxianMoney=" + lvyouluxianMoney +
            ", lvyouluxianPhoto=" + lvyouluxianPhoto +
            ", lvyouluxianContent=" + lvyouluxianContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
