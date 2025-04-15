package com.javatechie.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class ElkStackExampleApplication {

    Logger logger = LoggerFactory.getLogger(ElkStackExampleApplication.class);

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        logger.info("Garik, this is new info logs 17:32 ");
        return ResponseEntity.ok("OK");
    }

    public static void main(String[] args) {
        SpringApplication.run(ElkStackExampleApplication.class, args);
    }

}
