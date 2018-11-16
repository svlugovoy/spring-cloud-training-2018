package com.svlugovoy.helloworldservice;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallbackImpl implements HelloWorldService {

    @Override
    public String invokeHelloWorld() {
        return "Hello Service Not Available";
    }
}
