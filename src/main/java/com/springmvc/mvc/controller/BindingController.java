package com.springmvc.mvc.controller;

import com.springmvc.mvc.DAO.Person;
import com.springmvc.mvc.DAO.PersonImp;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by lixy3 on 18-1-23.
 */
@Controller
@RequestMapping("/binding/people")
public class BindingController {


    @RequestMapping(value = "/edit", method = RequestMethod.GET, params = "add")
    public String editPerson() {

        return "binding/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String savePerson(PersonImp person) {
    public String savePerson(@ModelAttribute PersonImp person) {

        System.out.println(ReflectionToStringBuilder.toString(person));

        return "redirect:hello"; // 重定向
//        return "forward:hello"; // 请求转发
    }
}
