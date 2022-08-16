package org.acme.test;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Route extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:my-queue").routeId("TEST")
                .process(exchange -> log.info("exchange {}", exchange.getExchangeId()));
    }
}
