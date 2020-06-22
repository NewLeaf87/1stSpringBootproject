package com.ldm.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    
@RequestMapping("/hello")
public String hello(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model) {
    model.addAttribute("name", name);
    return "hello.html";
}

@RequestMapping("/index")
    public String home(){
        return "index.html";
    }
@RequestMapping("/Page1")
    public String form(){
        return "Page1.html";
    }

    @RequestMapping("/Page2")
    public String other(){
        return "Page2.html";
    }

}