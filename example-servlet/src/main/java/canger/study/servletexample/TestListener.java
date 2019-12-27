package canger.study.servletexample;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

public class TestListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Listener init ***************************");
        ServletContext servletContext = servletContextEvent.getServletContext();
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            System.out.println("param-name:" + s + "-----param-value:" + servletContext.getInitParameter(s));
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
