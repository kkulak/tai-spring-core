package org.tai.spring.wiring;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tai.spring.wiring.application.ReportGenerator;
import org.tai.spring.wiring.config.AppConfig;

public class Go {

	private static final Logger LOGGER = LoggerFactory.getLogger(Go.class);
	
	public static void main(String[] args) throws IOException {

        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

			final ReportGenerator generator = context.getBean(ReportGenerator.class);
			generator.generate();

		} catch (Exception e) {
			LOGGER.error("My application has miserably failed", e);
			System.exit(1);
		}

	}

}
