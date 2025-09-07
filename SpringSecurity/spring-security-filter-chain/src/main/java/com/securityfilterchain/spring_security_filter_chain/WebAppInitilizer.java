package com.securityfilterchain.spring_security_filter_chain;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitilizer extends 
               AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles = {MyAppConfig.class};
        return configFiles;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings = {"/"};
        return mappings;
    }

}