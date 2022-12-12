package com.example.dockerdemo.controller;

import netscape.javascript.JSObject;
import netscape.javascript.JSUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YangYuan
 * @date 2022/8/31
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/a")
    public Object getTest(){
        Map<String, Object> data = new HashMap<>();
        data.put("name","狂徒张三");
        data.put("age",Math.random() * 200);
        return data;
    }
}
