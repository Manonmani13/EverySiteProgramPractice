package com.inmemory.inmemory_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

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
        // TODO Auto-generated method stub
 String[] mappings = {"/"};
        return mappings;
        }
    
}
