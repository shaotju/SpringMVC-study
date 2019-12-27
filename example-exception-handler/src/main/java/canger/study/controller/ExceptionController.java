package canger.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 *  如果某个具体Controller中没有对应的ExceptionHandler
 *  则到被@ControllerAdvice注解的类中寻找
 */
@ControllerAdvice
public class ExceptionController {
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "系统内部错误")
    @ExceptionHandler(ArithmeticException.class)
    public String handlerArithmeticException(HttpServletRequest request, ArithmeticException ex){
        request.setAttribute("errorMsg","Exception");
        return "error";
    }
}
