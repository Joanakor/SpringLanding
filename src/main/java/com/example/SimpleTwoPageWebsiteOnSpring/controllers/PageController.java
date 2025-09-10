package com.example.SimpleTwoPageWebsiteOnSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "index";
    }

}
