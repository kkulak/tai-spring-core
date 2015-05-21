package org.tai.spring.wiring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.tai.spring.wiring.Go;

@Configuration
@ComponentScan(basePackageClasses = Go.class)
@PropertySource(value = "report.properties")
public class AppConfig {
}
