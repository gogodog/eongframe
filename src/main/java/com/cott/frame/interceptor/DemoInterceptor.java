package com.cott.frame.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Title: DemoInterceptor.java
 * @Package com.cott.frame.interceptor
 * @Description: TODO(拦截器)
 * @author cott.wen
 * @date 2016年11月9日 下午8:06:12
 * @version c-willow v1.0
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

  private List<String> excludedUrls;

  public List<String> getExcludedUrls() {
    return excludedUrls;
  }

  public void setExcludedUrls(List<String> excludedUrls) {
    this.excludedUrls = excludedUrls;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	  System.out.println("前置拦截器");
	  return true;
  }
}
