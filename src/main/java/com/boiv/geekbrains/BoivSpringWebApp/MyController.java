package com.boiv.geekbrains.BoivSpringWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    // http://localhost:8189/App/index

    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/shop")
    public String shopPage(){
        return "shop";
    }
}
