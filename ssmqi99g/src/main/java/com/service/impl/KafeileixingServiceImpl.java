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


import com.dao.KafeileixingDao;
import com.entity.KafeileixingEntity;
import com.service.KafeileixingService;
import com.entity.vo.KafeileixingVO;
import com.entity.view.KafeileixingView;

@Service("kafeileixingService")
public class KafeileixingServiceImpl extends ServiceImpl<KafeileixingDao, KafeileixingEntity> implements KafeileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KafeileixingEntity> page = this.selectPage(
                new Query<KafeileixingEntity>(params).getPage(),
                new EntityWrapper<KafeileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KafeileixingEntity> wrapper) {
		  Page<KafeileixingView> page =new Query<KafeileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KafeileixingVO> selectListVO(Wrapper<KafeileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KafeileixingVO selectVO(Wrapper<KafeileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KafeileixingView> selectListView(Wrapper<KafeileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KafeileixingView selectView(Wrapper<KafeileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
