package canger.study.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exampleController")
public class ExampleController {

    @Autowired
    private Environment environment;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private ConfigurableListableBeanFactory beanFactory;

    @RequestMapping()
    public String index(){
        return "index";
    }
}
