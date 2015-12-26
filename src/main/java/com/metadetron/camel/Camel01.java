package com.metadetron.camel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.camel.model.RoutesDefinition;
import java.io.InputStream;
import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;

public class Camel01 {

    final Logger logger = LoggerFactory.getLogger(Wombat.class);

    public static void main(String[] args) throws Exception {

        logger.debug("Starting Camel01!");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Beans.xml");
        CamelContext camelContext = new SpringCamelContext(springContext);
        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
        logger.debug("Context stopped.");
    }
}
