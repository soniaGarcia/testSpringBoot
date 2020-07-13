package com.test.demospringboots;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 *
 * @author Sonia
 */
@SpringBootApplication(exclude = {
    MongoAutoConfiguration.class,
    MongoDataAutoConfiguration.class
})
public class SpringbootdockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdockerApplication.class, args);
    }

}
