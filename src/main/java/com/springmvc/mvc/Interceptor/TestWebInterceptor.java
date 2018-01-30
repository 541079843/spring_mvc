package com.springmvc.mvc.Interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * Created by lixy3 on 18-1-24.
 * 实现 WebRequestInterceptor 接口 ,实现拦截器
 * 注, preHandle 不能终止请求
 */
public class TestWebInterceptor implements WebRequestInterceptor {

    public void preHandle(WebRequest webRequest) throws Exception {

    }

    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
