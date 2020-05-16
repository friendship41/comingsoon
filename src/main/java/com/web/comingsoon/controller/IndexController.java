package com.web.comingsoon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @Value("${nowMode}")
    private String mode;

    @Value("${d_day}")
    private String dDay;

    @RequestMapping(value = "/")
    public String goToIndexPage(Model model){
        model.addAttribute("dDay", dDay);

        if (mode.equals("comingsoon")){
            model.addAttribute("modeP", "홈페이지 제작중입니다.");
        }
        else if(mode.equals("patch")) {
            model.addAttribute("modeP", "홈페이지 점검중입니다.");
        }
        else{
            model.addAttribute("modeP", "흠......");
        }
        return "index.html";
    }
}
