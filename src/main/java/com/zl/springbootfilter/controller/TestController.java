package com.zl.springbootfilter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 13:25
 */
@RestController
public class TestController {

    @RequestMapping("/filter")
    public String filter(HttpServletRequest request, HttpServletResponse response){

        return "success";
    }
}
