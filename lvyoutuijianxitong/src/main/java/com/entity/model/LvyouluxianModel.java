package com.entity.model;

import com.entity.LvyouluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvyouluxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 路线编号
     */
    private String lvyouluxianUuidNumber;


    /**
     * 路线标题
     */
    private String lvyouluxianName;


    /**
     * 路线类型
     */
    private Integer lvyouluxianTypes;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 路线预算
     */
    private Double lvyouluxianMoney;


    /**
     * 路线图片
     */
    private String lvyouluxianPhoto;


    /**
     * 路线详情
     */
    private String lvyouluxianContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：路线编号
	 */
    public String getLvyouluxianUuidNumber() {
        return lvyouluxianUuidNumber;
    }


    /**
	 * 设置：路线编号
	 */
    public void setLvyouluxianUuidNumber(String lvyouluxianUuidNumber) {
        this.lvyouluxianUuidNumber = lvyouluxianUuidNumber;
    }
    /**
	 * 获取：路线标题
	 */
    public String getLvyouluxianName() {
        return lvyouluxianName;
    }


    /**
	 * 设置：路线标题
	 */
    public void setLvyouluxianName(String lvyouluxianName) {
        this.lvyouluxianName = lvyouluxianName;
    }
    /**
	 * 获取：路线类型
	 */
    public Integer getLvyouluxianTypes() {
        return lvyouluxianTypes;
    }


    /**
	 * 设置：路线类型
	 */
    public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
        this.lvyouluxianTypes = lvyouluxianTypes;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：路线预算
	 */
    public Double getLvyouluxianMoney() {
        return lvyouluxianMoney;
    }


    /**
	 * 设置：路线预算
	 */
    public void setLvyouluxianMoney(Double lvyouluxianMoney) {
        this.lvyouluxianMoney = lvyouluxianMoney;
    }
    /**
	 * 获取：路线图片
	 */
    public String getLvyouluxianPhoto() {
        return lvyouluxianPhoto;
    }


    /**
	 * 设置：路线图片
	 */
    public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
        this.lvyouluxianPhoto = lvyouluxianPhoto;
    }
    /**
	 * 获取：路线详情
	 */
    public String getLvyouluxianContent() {
        return lvyouluxianContent;
    }


    /**
	 * 设置：路线详情
	 */
    public void setLvyouluxianContent(String lvyouluxianContent) {
        this.lvyouluxianContent = lvyouluxianContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
