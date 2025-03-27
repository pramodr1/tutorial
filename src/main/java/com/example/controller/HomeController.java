package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/spring") // <== This is the base path
public class HomeController {

    @RequestMapping("/home")  // Final URL = /spring-mvc/home
    public ModelAndView showHomePage() {
        return new ModelAndView("home"); // This maps to /WEB-INF/views/home.jsp
    }
    
    @RequestMapping("/city")  // Final URL = /spring-mvc/home
    public ModelAndView showCityPage() {
        return new ModelAndView("city"); // This maps to /WEB-INF/views/city.jsp
    }
    
    @RequestMapping("/country")  
    @ResponseBody
    public String showCountryPage() {
        return "India"; 
    }
 
}
