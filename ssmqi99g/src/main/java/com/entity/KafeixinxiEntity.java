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
 * 咖啡信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
@TableName("kafeixinxi")
public class KafeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KafeixinxiEntity() {
		
	}
	
	public KafeixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 咖啡名称
	 */
					
	private String kafeimingcheng;
	
	/**
	 * 咖啡类型
	 */
					
	private String kafeileixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 主料
	 */
					
	private String zhuliao;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 冷热饮
	 */
					
	private String lengreyin;
	
	/**
	 * 咖啡详情
	 */
					
	private String kafeixiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：咖啡名称
	 */
	public void setKafeimingcheng(String kafeimingcheng) {
		this.kafeimingcheng = kafeimingcheng;
	}
	/**
	 * 获取：咖啡名称
	 */
	public String getKafeimingcheng() {
		return kafeimingcheng;
	}
	/**
	 * 设置：咖啡类型
	 */
	public void setKafeileixing(String kafeileixing) {
		this.kafeileixing = kafeileixing;
	}
	/**
	 * 获取：咖啡类型
	 */
	public String getKafeileixing() {
		return kafeileixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：主料
	 */
	public void setZhuliao(String zhuliao) {
		this.zhuliao = zhuliao;
	}
	/**
	 * 获取：主料
	 */
	public String getZhuliao() {
		return zhuliao;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：冷热饮
	 */
	public void setLengreyin(String lengreyin) {
		this.lengreyin = lengreyin;
	}
	/**
	 * 获取：冷热饮
	 */
	public String getLengreyin() {
		return lengreyin;
	}
	/**
	 * 设置：咖啡详情
	 */
	public void setKafeixiangqing(String kafeixiangqing) {
		this.kafeixiangqing = kafeixiangqing;
	}
	/**
	 * 获取：咖啡详情
	 */
	public String getKafeixiangqing() {
		return kafeixiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
