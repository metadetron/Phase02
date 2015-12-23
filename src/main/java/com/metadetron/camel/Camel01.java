package com.metadetron.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class Camel01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Camel01!");
        InputStream is = getClass().getResourceAsStream("camelRoute.xml");
        RoutesDefinition routes = context.loadRoutesDefinition(is);
        context.addRouteDefinitions(routes.getRoutes());
        context.start();
        Thread.sleep(10000);
        context.stop();
        System.out.println("Context stopped.");
    }
}
