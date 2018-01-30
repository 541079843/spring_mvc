package com.springmvc.mvc.controller;

import com.springmvc.mvc.DAO.PersonImp;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixy3 on 18-1-24.
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    // 返回 json 方式1
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseEntity<PersonImp> getPerson() {

        PersonImp p = new PersonImp();
        p.setAge(23);
        p.setName("Tom Junia");

        System.out.println(ReflectionToStringBuilder.toString(p));

        return new ResponseEntity<PersonImp>(p, HttpStatus.OK);
    }

    // 返回 json 方式2
    @RequestMapping(value = "/map", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getMap() {

        Map<String, Object> mm = new HashMap<String, Object>(3);
        mm.put("name", "Alix");
        mm.put("age", 30);
        mm.put("birth", "19880102");
        return mm;
    }

}
