package com.sparta.springprepare.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    //Content-Type : text/html
    // Response Body
    // {"name":"Robbie", "age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }
    //Content-Type : application/json
    // Response Body
    //{"name":"Robbie", "age":95}
    @GetMapping("/json/class")
    @ResponseBody //html을 받환하지 않을땐 ResponseBody annotation 해주기
    public Star helloClassJson(){
        return new Star("김우진",27); //Servlet을 통해 구현하게 되면 Content-type등 모든 것을 설정해주어야 함
    }
}
