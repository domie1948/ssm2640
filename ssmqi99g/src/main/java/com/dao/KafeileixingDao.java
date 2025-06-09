package com.dao;

import com.entity.KafeileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KafeileixingVO;
import com.entity.view.KafeileixingView;


/**
 * 咖啡类型
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface KafeileixingDao extends BaseMapper<KafeileixingEntity> {
	
	List<KafeileixingVO> selectListVO(@Param("ew") Wrapper<KafeileixingEntity> wrapper);
	
	KafeileixingVO selectVO(@Param("ew") Wrapper<KafeileixingEntity> wrapper);
	
	List<KafeileixingView> selectListView(@Param("ew") Wrapper<KafeileixingEntity> wrapper);

	List<KafeileixingView> selectListView(Pagination page,@Param("ew") Wrapper<KafeileixingEntity> wrapper);
	
	KafeileixingView selectView(@Param("ew") Wrapper<KafeileixingEntity> wrapper);
	
}
