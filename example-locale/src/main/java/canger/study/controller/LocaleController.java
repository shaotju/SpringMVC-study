package canger.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class LocaleController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/getLocale")
    public String getLocale(HttpServletRequest request){
        Locale locale = RequestContextUtils.getLocale(request);
        request.setAttribute("msg",locale.toString());
        return "message";
    }

    @RequestMapping("/getMessageName")
    public String getMessageName(HttpServletRequest request,Locale locale){
        String message = messageSource.getMessage("name", null, "Harden", locale);
        request.setAttribute("msg",message);
        return "message";
    }
}
