package com.entity.view;

import com.entity.KafeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咖啡信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
@TableName("kafeixinxi")
public class KafeixinxiView  extends KafeixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KafeixinxiView(){
	}
 
 	public KafeixinxiView(KafeixinxiEntity kafeixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kafeixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
