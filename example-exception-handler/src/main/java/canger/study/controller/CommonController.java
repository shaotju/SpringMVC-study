package canger.study.controller;

import canger.study.exception.MyStatusException;
import canger.study.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommonController {

    @RequestMapping("/userInfo")
    public String userInfo(User user){
        return "success";
    }

    @RequestMapping("/argumentException")
    public String throwException(){
        throw new IllegalArgumentException("Test");
    }

    @RequestMapping("/mathException")
    public String throwMathException(){
        int a = 10;
        int b = 0;
        int c = a/b;
        return "success";
    }

    @RequestMapping("/myStatusException")
    public String throwMyStatusException(){
        throw new MyStatusException("my status exception");
    }


/***********************************************************************************************************/


    @ExceptionHandler(BindException.class)
    public String handlerBindException(HttpServletRequest request,BindException ex){
        request.setAttribute("errorMsg","BindException");
        return "error";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handlerArgumentException(HttpServletRequest request,IllegalArgumentException ex){
        request.setAttribute("errorMsg","IllegalArgumentException");
        return "error";
    }
}
