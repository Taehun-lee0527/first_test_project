package com.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
  /**
    * Servlet 관련
    */
//  @Override
//  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//      configurer.enable();
//      return;
//  }
  
  /**
    * View Resolver 경로 설정
    */
  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp("/WEB-INF/jsp/", ".jsp");
  }
}
