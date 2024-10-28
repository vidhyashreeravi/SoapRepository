package com.example.helloworld;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.helloworld.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}