package com.bt.springboot3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class Index {

    @GetMapping("/bt")
    public String index(){
        System.out.println("hello this running bt index");
        return "index.html";
    }
}
