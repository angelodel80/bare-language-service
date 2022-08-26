package it.cnr.ilc.cophilab.languages.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
 attenzione inclusione libreria jar locale. Plugin maven con task in verifica maven
 */
@SpringBootApplication
public class DSLBareApplication {
    private static final Logger log = LoggerFactory.getLogger(DSLBareApplication.class);

    public static void main(String[] args) {
        log.info("starting SpringBoot..");
        SpringApplication.run(DSLBareApplication.class, args);
    }

}
