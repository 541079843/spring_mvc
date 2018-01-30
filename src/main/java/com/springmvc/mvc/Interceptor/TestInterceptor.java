package com.springmvc.mvc.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixy3 on 18-1-24.
 *
 * 实现 HandlerInterceptor  接口 ,实现拦截器
 */
public class TestInterceptor implements HandlerInterceptor {

    /**
     * o : 表示别拦截的对象
     * 返回值 : 是否拦截请求
     * */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("TestInterceptor:preHandle");

        return true;
    }

    /**
     *  modelAndView : 修改它,来改变显示的视图,或者修改发往视图的数据
     * */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("TestInterceptor:postHandle");
    }

    /**
     * 请求响应完成之后,处理一些收尾工作
     * */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("TestInterceptor:afterCompletion");
    }
}
