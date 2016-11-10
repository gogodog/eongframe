package com.cott.cwillow.data.mapper;

import com.cott.cwillow.data.model.Demo;
import com.elong.mobile.commons.db.DataSource;

/**
 * @Title: DemoMapper.java
 * @Package com.cott.cwillow.data.mapper
 * @Description: TODO(demoMapper)
 * @author cott.wen
 * @date 2016年11月9日 下午7:48:43
 * @version c-willow v1.0
 */
public interface DemoMapper{
  @DataSource("read")
  public Demo selectOne(String id);
}
