package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusskafeixinxiDao;
import com.entity.DiscusskafeixinxiEntity;
import com.service.DiscusskafeixinxiService;
import com.entity.vo.DiscusskafeixinxiVO;
import com.entity.view.DiscusskafeixinxiView;

@Service("discusskafeixinxiService")
public class DiscusskafeixinxiServiceImpl extends ServiceImpl<DiscusskafeixinxiDao, DiscusskafeixinxiEntity> implements DiscusskafeixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskafeixinxiEntity> page = this.selectPage(
                new Query<DiscusskafeixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusskafeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskafeixinxiEntity> wrapper) {
		  Page<DiscusskafeixinxiView> page =new Query<DiscusskafeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskafeixinxiVO> selectListVO(Wrapper<DiscusskafeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskafeixinxiVO selectVO(Wrapper<DiscusskafeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskafeixinxiView> selectListView(Wrapper<DiscusskafeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskafeixinxiView selectView(Wrapper<DiscusskafeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
