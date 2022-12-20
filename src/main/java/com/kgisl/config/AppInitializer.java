package com.kgisl.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * AppInitializer
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
            AppContext.class
        };
        //return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
            WebMvcConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }

    
}