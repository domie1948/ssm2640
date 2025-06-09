package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KafeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KafeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeixinxiView;


/**
 * 咖啡信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface KafeixinxiService extends IService<KafeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KafeixinxiVO> selectListVO(Wrapper<KafeixinxiEntity> wrapper);
   	
   	KafeixinxiVO selectVO(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
   	
   	List<KafeixinxiView> selectListView(Wrapper<KafeixinxiEntity> wrapper);
   	
   	KafeixinxiView selectView(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KafeixinxiEntity> wrapper);
   	
}

