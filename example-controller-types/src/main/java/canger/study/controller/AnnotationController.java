package canger.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/annotationController")
@Controller
public class AnnotationController {

    @RequestMapping
    public String test(HttpServletRequest request){
        request.setAttribute("module","controller-type-annotation");
        return "success";
    }
}
