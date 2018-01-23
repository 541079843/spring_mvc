package com.springmvc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by lixy3 on 18-1-23.
 */
@Controller
@RequestMapping("/mvc")
public class RequestController {

    // 处理 /mvc/people?pId=123
    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public String viewPerson1(@RequestParam("pId") Integer personId, Model model) {
        System.out.println(personId);

        model.addAttribute(personId);

        return "hello";
    }

    // 处理 /mvc/people/123, RESTful 风格
    @RequestMapping(value = "/people_rest/{pId}", method = RequestMethod.GET)
    public String viewPerson2(@PathVariable("pId") Integer personId, Map<String, Object> model) {
        System.out.println(personId);

        model.put("personId", personId);

        return "hello";
    }

    // 处理 /hello/people_old?pId=123, HttpServletRequest 传统方式处理请求参数
    @RequestMapping(value = "/people_old", method = RequestMethod.GET)
    public String viewPerson3(HttpServletRequest request) {
        Integer personId = Integer.valueOf(request.getParameter("pId"));

        System.out.println(personId);

        request.setAttribute("personId", personId);

        return "hello";
    }
}
