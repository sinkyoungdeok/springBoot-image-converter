package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        model.addAttribute("imgName", "org.jpg");
        return "resize";
    }

    @RequestMapping(value="/resize.do", method=RequestMethod.POST)
    public String resize_page_post(String percent,String width,String height,Model model) {
        cmd.resizeShellCmd(percent,width,height);
        model.addAttribute("imgName", "resize.jpg");
        return "resize";
    }

    @RequestMapping(value="/preview.do")
    public String preview_page(Model model) {
        cmd.originalShellCmd();
        return "preview";
    }

    @RequestMapping(value="/crop.do")
    public String crop_page(Model model) {
        model.addAttribute("imgName", "org.jpg");
        return "crop";
    }

    @RequestMapping(value="/crop.do", method=RequestMethod.POST)
    public String crop_page_post(String width, String height, String xPoint, String yPoint,String center, Model model) {
        cmd.cropShellCmd(width,height,xPoint,yPoint,center);
        model.addAttribute("imgName", "crop.jpg");
        return "crop";
    }

    @RequestMapping(value="/composite.do")
    public String composite_page(Model model) {
        model.addAttribute("imgName", "org.jpg");
        return "composite";
    }

    @RequestMapping(value="/composite.do", method=RequestMethod.POST)
    public String composite_page_post(String img, Model model) {
        cmd.compositeShellCmd();
        model.addAttribute("imgName", "composite.jpg");
        return "composite";
    }

    
}