package com.doyutu.springbootseedproject.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
@Configuration
public class ErrorPageConfig {

    /**
     * 自定义异常处理路径
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> containerCustomizer() {
        return factory -> {
            factory.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/404.html"));
            factory.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED, "/404.html"));
            factory.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/404.html/error/404.html"));
            factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
            factory.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/404.html"));
            factory.addErrorPages(new ErrorPage(Throwable.class, "/404.html"));
        };
    }

}
