package com.yu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yu on 2019/2/23.
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "hello world quick";
    }

}
