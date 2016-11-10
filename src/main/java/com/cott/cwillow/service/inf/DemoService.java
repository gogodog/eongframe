package com.cott.cwillow.service.inf;

import java.util.List;

/**
 * @Title: DemoService.java
 * @Package com.cott.cwillow.service.inf
 * @Description: TODO(框架service接口)
 * @author cott.wen
 * @date 2016年11月9日 下午7:27:07
 * @version c-willow v1.0
 */
public interface DemoService {
	/**
	 * @Title: selectOne
	 * @Author: cott.wen
	 * @Description: TODO(查询一条语句)
	 * @param @param id
	 * @param @return    设定文件
	 * @return List    返回类型
	 * @throws
	 */
	public List<Object> selectOne(String id);
}
