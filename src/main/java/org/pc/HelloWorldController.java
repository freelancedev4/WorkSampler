package org.pc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${env}")
    private String env;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from " + env;
    }
}