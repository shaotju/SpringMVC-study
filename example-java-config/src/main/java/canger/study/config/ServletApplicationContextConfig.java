package canger.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("canger.study.controller")
@EnableWebMvc
public class ServletApplicationContextConfig {
}
