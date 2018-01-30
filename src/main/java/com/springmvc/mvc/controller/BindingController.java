package com.springmvc.mvc.controller;

import com.springmvc.mvc.DAO.PersonImp;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lixy3 on 18-1-23.
 */
@Controller
@RequestMapping("/binding/people")
public class BindingController {


    @RequestMapping(value = "/edit", method = RequestMethod.GET, params = "add")
    public String editPerson() {
        System.out.println("/binding/people/edit");
        return "binding/edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public PersonImp savePerson(PersonImp person) {
//    public String savePerson(@ModelAttribute PersonImp person) {

        System.out.println(ReflectionToStringBuilder.toString(person));

        return person;
    }
}
