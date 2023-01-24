package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method =  = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("by");
        return "Hello w";
    }
}
