package com.dao;

import com.entity.KafeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KafeixinxiVO;
import com.entity.view.KafeixinxiView;


/**
 * 咖啡信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface KafeixinxiDao extends BaseMapper<KafeixinxiEntity> {
	
	List<KafeixinxiVO> selectListVO(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
	
	KafeixinxiVO selectVO(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
	
	List<KafeixinxiView> selectListView(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);

	List<KafeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
	
	KafeixinxiView selectView(@Param("ew") Wrapper<KafeixinxiEntity> wrapper);
	
}
