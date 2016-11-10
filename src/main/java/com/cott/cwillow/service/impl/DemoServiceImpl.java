package com.cott.cwillow.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cott.cwillow.data.mapper.DemoMapper;
import com.cott.cwillow.data.model.Demo;
import com.cott.cwillow.service.inf.DemoService;

/**
 * 
 * @Title: DemoServiceImpl.java
 * @Package com.cott.cwillow.service.impl
 * @Description: TODO(实现类)
 * @author cott.wen
 * @date 2016年11月9日 下午7:31:57
 * @version c-willow v1.0
 */
@Service
public class DemoServiceImpl implements DemoService{

	@Resource
    DemoMapper demoMapper;
	
	@Override
	public List<Object> selectOne(String id) {
		Demo demo = demoMapper.selectOne(id);
		List<Object> list = new ArrayList<Object>();
		list.add(demo);
		return list;
	}
}
