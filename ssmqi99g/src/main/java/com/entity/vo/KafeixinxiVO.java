package com.entity.vo;

import com.entity.KafeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 咖啡信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public class KafeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
