package com.chanpion.spark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

/**
 * @author April Chen
 * @date 2020/11/24 20:20
 */
@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
public class SparkApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SparkApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting spark application ...");
        SpringApplication.run(SparkApplication.class, args);
    }

    public void run(String... args) throws Exception {
        LOGGER.info("Spark application started  ...");
    }
}
