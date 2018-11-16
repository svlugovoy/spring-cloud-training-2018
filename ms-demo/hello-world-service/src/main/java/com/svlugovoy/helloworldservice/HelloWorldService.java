package com.svlugovoy.helloworldservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello-service", fallback = HelloServiceFallbackImpl.class)
@Component
public interface HelloWorldService {

    @GetMapping(value="/hello/world-with-feign")
    String invokeHelloWorld();

}
