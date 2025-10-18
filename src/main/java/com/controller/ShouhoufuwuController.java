package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import java.util.Collections;

import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShouhoufuwuEntity;
import com.entity.view.ShouhoufuwuView;

import com.service.ShouhoufuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 售后服务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-11-25 14:43:31
 */
@RestController
@RequestMapping("/shouhoufuwu")
public class ShouhoufuwuController {
    @Autowired
    private ShouhoufuwuService shouhoufuwuService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShouhoufuwuEntity shouhoufuwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shouhoufuwu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shangjia")) {
			shouhoufuwu.setShangjiahao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShouhoufuwuEntity> ew = new EntityWrapper<ShouhoufuwuEntity>();



		PageUtils page = shouhoufuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouhoufuwu), params), params));
				Map<String, String> deSens = new HashMap<>();
				DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShouhoufuwuEntity shouhoufuwu, 
		HttpServletRequest request){
        EntityWrapper<ShouhoufuwuEntity> ew = new EntityWrapper<ShouhoufuwuEntity>();

		PageUtils page = shouhoufuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouhoufuwu), params), params));
		
				Map<String, String> deSens = new HashMap<>();
				DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShouhoufuwuEntity shouhoufuwu){
       	EntityWrapper<ShouhoufuwuEntity> ew = new EntityWrapper<ShouhoufuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shouhoufuwu, "shouhoufuwu")); 
        return R.ok().put("data", shouhoufuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShouhoufuwuEntity shouhoufuwu){
        EntityWrapper< ShouhoufuwuEntity> ew = new EntityWrapper< ShouhoufuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shouhoufuwu, "shouhoufuwu")); 
		ShouhoufuwuView shouhoufuwuView =  shouhoufuwuService.selectView(ew);
		return R.ok("查询售后服务成功").put("data", shouhoufuwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShouhoufuwuEntity shouhoufuwu = shouhoufuwuService.selectById(id);
				Map<String, String> deSens = new HashMap<>();
				DeSensUtil.desensitize(shouhoufuwu,deSens);
        return R.ok().put("data", shouhoufuwu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShouhoufuwuEntity shouhoufuwu = shouhoufuwuService.selectById(id);
				Map<String, String> deSens = new HashMap<>();
				DeSensUtil.desensitize(shouhoufuwu,deSens);
        return R.ok().put("data", shouhoufuwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShouhoufuwuEntity shouhoufuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shouhoufuwu);
        shouhoufuwuService.insert(shouhoufuwu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShouhoufuwuEntity shouhoufuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shouhoufuwu);
        shouhoufuwuService.insert(shouhoufuwu);
        return R.ok().put("data",shouhoufuwu.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShouhoufuwuEntity shouhoufuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shouhoufuwu);
        //全部更新
        shouhoufuwuService.updateById(shouhoufuwu);

        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShouhoufuwuEntity> list = new ArrayList<ShouhoufuwuEntity>();
        for(Long id : ids) {
            ShouhoufuwuEntity shouhoufuwu = shouhoufuwuService.selectById(id);
            shouhoufuwu.setSfsh(sfsh);
            shouhoufuwu.setShhf(shhf);
            list.add(shouhoufuwu);
        }
        shouhoufuwuService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shouhoufuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	











}
