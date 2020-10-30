package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.helloworld.command.CommandLineExecutor;


@Controller
public class DefaultController {
    CommandLineExecutor cmd = new CommandLineExecutor();
    
    @RequestMapping(value="/")
    public String index_page(Model model) {
        model.addAttribute("name", "name 입니다.");
        return "index";
    }

    @RequestMapping(value="/index.do")
    public String index_page2(Model model) {
        model.addAttribute("name", "name 입니다.");
        return "index";
    }

    @RequestMapping(value="/resize.do")
    public String resize_page(Model model) {
        cmd.resizeShellCmd();
        return "resize";
    }

    @RequestMapping(value="/preview.do")
    public String preview_page(Model model) {
        cmd.originalShellCmd();
        return "preview";
    }
}