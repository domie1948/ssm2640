package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KafeileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KafeileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeileixingView;


/**
 * 咖啡类型
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface KafeileixingService extends IService<KafeileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KafeileixingVO> selectListVO(Wrapper<KafeileixingEntity> wrapper);
   	
   	KafeileixingVO selectVO(@Param("ew") Wrapper<KafeileixingEntity> wrapper);
   	
   	List<KafeileixingView> selectListView(Wrapper<KafeileixingEntity> wrapper);
   	
   	KafeileixingView selectView(@Param("ew") Wrapper<KafeileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KafeileixingEntity> wrapper);
   	
}

