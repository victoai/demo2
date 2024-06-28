package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {


    @ResponseBody
    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    @ResponseBody
    @GetMapping("/hi2")
    public String hi2(){
        return "hi2";
    }
}
