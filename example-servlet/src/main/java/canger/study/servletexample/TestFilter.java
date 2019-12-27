package canger.study.servletexample;


import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init ***************************");
        System.out.println("Servlet name " + filterConfig.getFilterName());
        Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            System.out.println("param-name:" + s + "-----param-value:" + filterConfig.getInitParameter(s));
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
