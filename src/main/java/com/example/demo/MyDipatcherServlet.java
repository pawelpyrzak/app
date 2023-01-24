package com.example.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDipatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    //Konfiguracja Springa- warstwa logiki
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }
    //Konfiguracja Sprina web- kontrolery
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    //Mapowanie serwletu na "/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
