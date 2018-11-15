package com.svlugovoy.helloworldservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello-service")
@Component
public interface HelloWorldService {

    @GetMapping(value="/hello/world-with-feign")
    String invokeHelloWorld();

}
