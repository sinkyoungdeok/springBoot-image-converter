package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping(value="/")
public class DefaultController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "name 입니다.");
        return "index";
    }
}