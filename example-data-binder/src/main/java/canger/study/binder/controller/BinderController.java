package canger.study.binder.controller;

import canger.study.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BinderController {

    @RequestMapping("/userInfo")
    public String userInfo(String name,User user){
        return "success";
    }
}
