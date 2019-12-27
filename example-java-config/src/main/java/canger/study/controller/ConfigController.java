package canger.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConfigController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        request.setAttribute("message","success");
        return "message";
    }
}
