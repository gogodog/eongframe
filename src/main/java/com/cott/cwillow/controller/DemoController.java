package com.cott.cwillow.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.cott.cwillow.service.inf.DemoService;

/**
 * @Title: DemoController.java
 * @Package com.cott.cwillow.controller
 * @Description: TODO(框架测试机器)
 * @author cott.wen
 * @date 2016年11月9日 下午7:22:48
 * @version c-willow v1.0
 */
@Controller
@RequestMapping("/frame")
public class DemoController {
	@Resource
    private DemoService demoService;
	protected static Logger REQUEST = Logger.getLogger("web.request");
	
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	public String updateTicket(){
		System.out.println("控制器");
		List<Object> demos = demoService.selectOne("1");
		System.out.println("查询数据：" + JSONObject.toJSONString(demos));
		return "demo";
	}
}
