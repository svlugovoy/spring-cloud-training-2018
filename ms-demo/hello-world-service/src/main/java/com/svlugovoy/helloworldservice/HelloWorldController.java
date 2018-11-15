package com.svlugovoy.helloworldservice;

import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/hello-world")
    public String sayHelloWorld(){
        return restTemplate.getForObject("http://hello-service/hello/world", String.class);
    }

    @GetMapping("/hello-world-feign")
    public String sayHelloWorldFeign(){
        return helloWorldService.invokeHelloWorld();
    }

}
