package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskafeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskafeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskafeixinxiView;


/**
 * 咖啡信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface DiscusskafeixinxiService extends IService<DiscusskafeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskafeixinxiVO> selectListVO(Wrapper<DiscusskafeixinxiEntity> wrapper);
   	
   	DiscusskafeixinxiVO selectVO(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
   	
   	List<DiscusskafeixinxiView> selectListView(Wrapper<DiscusskafeixinxiEntity> wrapper);
   	
   	DiscusskafeixinxiView selectView(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskafeixinxiEntity> wrapper);
   	
}

