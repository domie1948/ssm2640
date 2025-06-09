package com.dao;

import com.entity.DiscusskafeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskafeixinxiVO;
import com.entity.view.DiscusskafeixinxiView;


/**
 * 咖啡信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
public interface DiscusskafeixinxiDao extends BaseMapper<DiscusskafeixinxiEntity> {
	
	List<DiscusskafeixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
	
	DiscusskafeixinxiVO selectVO(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
	
	List<DiscusskafeixinxiView> selectListView(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);

	List<DiscusskafeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
	
	DiscusskafeixinxiView selectView(@Param("ew") Wrapper<DiscusskafeixinxiEntity> wrapper);
	
}
