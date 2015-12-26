package com.metadetron.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.RoutesDefinition;
import java.io.InputStream;

public class Camel01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Camel01!");
        CamelContext context = new DefaultCamelContext(); // is it default?
        context.start();
        Thread.sleep(10000);
        context.stop();
        System.out.println("Context stopped.");
    }
}
