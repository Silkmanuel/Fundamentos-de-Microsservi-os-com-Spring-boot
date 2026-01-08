package com.in28minuts.rest.webservice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWordBean helloWorldBean() {
        return new HelloWordBean("Hello Word");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWordBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWordBean(String.format("Hello Word %s", name));
    }
}
