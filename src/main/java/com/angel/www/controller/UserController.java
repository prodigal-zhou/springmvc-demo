package com.angel.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
