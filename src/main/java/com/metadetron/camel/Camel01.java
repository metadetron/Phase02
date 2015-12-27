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
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Camel01 implements BundleActivator {

    final static Logger logger = LoggerFactory.getLogger(Camel01.class);
    CamelContext camelContext = null;

    public static void main(String[] args) throws Exception {
        logger.info("Starting Camel01!");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Beans.xml");
        CamelContext camelContext = new SpringCamelContext(springContext);
        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
        logger.info("Context stopped.");
    }

    public void start(BundleContext context) throws Exception {
        logger.info("Starting Camel01 OSGI component!");
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Beans.xml");
        camelContext = new SpringCamelContext(springContext);
        camelContext.start();
        logger.info("Camel context started");
    }

    public void stop(BundleContext context) throws Exception {
        logger.info("Stoping Camel01 OSGI component!");
        camelContext.stop();
        logger.info("Context stopped.");
    }    

}
