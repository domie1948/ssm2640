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


import com.dao.KafeixinxiDao;
import com.entity.KafeixinxiEntity;
import com.service.KafeixinxiService;
import com.entity.vo.KafeixinxiVO;
import com.entity.view.KafeixinxiView;

@Service("kafeixinxiService")
public class KafeixinxiServiceImpl extends ServiceImpl<KafeixinxiDao, KafeixinxiEntity> implements KafeixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KafeixinxiEntity> page = this.selectPage(
                new Query<KafeixinxiEntity>(params).getPage(),
                new EntityWrapper<KafeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KafeixinxiEntity> wrapper) {
		  Page<KafeixinxiView> page =new Query<KafeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KafeixinxiVO> selectListVO(Wrapper<KafeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KafeixinxiVO selectVO(Wrapper<KafeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KafeixinxiView> selectListView(Wrapper<KafeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KafeixinxiView selectView(Wrapper<KafeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
