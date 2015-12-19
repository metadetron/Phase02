package com.metadetron.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class Camel01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Camel01!");
        CamelContext context = new DefaultCamelContext();
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("file:/home/cracoviano/tmp/tmp")
                    .to("smtp://smtp.google.com?username=testmetadetron@gmail.com&password=test2test&from=cracoviano&to=cracoviano@gmail.com&subject=Test z Camela");
                }
            });

            ProducerTemplate template = context.createProducerTemplate();
            System.out.println("Starting context...");
            context.start();
            Thread.sleep(10000);
        } finally {
            context.stop();
            System.out.println("Context stopped.");
        }
    }
}
