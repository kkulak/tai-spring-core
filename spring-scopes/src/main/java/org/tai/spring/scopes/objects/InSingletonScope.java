package org.tai.spring.scopes.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

public class InSingletonScope implements ApplicationContextAware {
    private static final Logger L = LoggerFactory.getLogger(InSingletonScope.class);
    private ApplicationContext applicationContext;

    public void postInit() {
        L.info("postInit(). Bean names:");
        Stream.
                of(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

    public void destroy() {
        L.info("destroy()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
