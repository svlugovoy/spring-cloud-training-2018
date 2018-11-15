package com.svlugovoy.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

    @Value("${end.message:@@@}")
    private String message;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name + " " + message;
    }
}
