package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")//기본 경로 지정
class HelloController {
    @GetMapping("/hello")
    @ResponseBody // html 파일이 아닌것 반환시
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/hello")//경로는 중복이 가능하지만 메소드 중복은 불가능
    @ResponseBody // html 파일이 아닌것 반환시
    public String helloPost() {
        return "Hello World";
    }
    @GetMapping("/hello")
    @ResponseBody // html 파일이 아닌것 반환시
    public String helloGet2() {
        return "Hello World2";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "Post Method 요청";
    }

    @PostMapping("/put")
    @ResponseBody
    public String put() {
        return "Put Method 요청";
    }

    @PostMapping("/delete")
    @ResponseBody
    public String delete() {
        return "Delete Method 요청";
    }
}