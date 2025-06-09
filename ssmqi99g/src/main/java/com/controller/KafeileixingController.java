package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KafeileixingEntity;
import com.entity.view.KafeileixingView;

import com.service.KafeileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 咖啡类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 16:40:07
 */
@RestController
@RequestMapping("/kafeileixing")
public class KafeileixingController {
    @Autowired
    private KafeileixingService kafeileixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KafeileixingEntity kafeileixing, 
		HttpServletRequest request){

        EntityWrapper<KafeileixingEntity> ew = new EntityWrapper<KafeileixingEntity>();
		PageUtils page = kafeileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kafeileixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KafeileixingEntity kafeileixing, HttpServletRequest request){
        EntityWrapper<KafeileixingEntity> ew = new EntityWrapper<KafeileixingEntity>();
		PageUtils page = kafeileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kafeileixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KafeileixingEntity kafeileixing){
       	EntityWrapper<KafeileixingEntity> ew = new EntityWrapper<KafeileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kafeileixing, "kafeileixing")); 
        return R.ok().put("data", kafeileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KafeileixingEntity kafeileixing){
        EntityWrapper< KafeileixingEntity> ew = new EntityWrapper< KafeileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kafeileixing, "kafeileixing")); 
		KafeileixingView kafeileixingView =  kafeileixingService.selectView(ew);
		return R.ok("查询咖啡类型成功").put("data", kafeileixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KafeileixingEntity kafeileixing = kafeileixingService.selectById(id);
        return R.ok().put("data", kafeileixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KafeileixingEntity kafeileixing = kafeileixingService.selectById(id);
        return R.ok().put("data", kafeileixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KafeileixingEntity kafeileixing, HttpServletRequest request){
    	kafeileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kafeileixing);

        kafeileixingService.insert(kafeileixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KafeileixingEntity kafeileixing, HttpServletRequest request){
    	kafeileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kafeileixing);

        kafeileixingService.insert(kafeileixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KafeileixingEntity kafeileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kafeileixing);
        kafeileixingService.updateById(kafeileixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kafeileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KafeileixingEntity> wrapper = new EntityWrapper<KafeileixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kafeileixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
