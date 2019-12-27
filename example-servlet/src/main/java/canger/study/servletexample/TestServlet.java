package canger.study.servletexample;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Enumeration;

public class TestServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet init ***************************");
        System.out.println("Servlet name " + config.getServletName());
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            System.out.println("param-name:" + s + "-----param-value:" + config.getInitParameter(s));
        }
    }
}
