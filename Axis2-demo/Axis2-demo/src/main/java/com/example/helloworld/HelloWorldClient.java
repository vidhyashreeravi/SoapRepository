package com.example.helloworld;

import com.example.helloworld.HelloWorldServiceStub;
import com.example.helloworld.HelloWorldServiceStub.SayHello;
import com.example.helloworld.HelloWorldServiceStub.SayHelloResponse;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            HelloWorldServiceStub stub = new HelloWorldServiceStub("http://localhost:8080/HelloWorldService");
            SayHello request = new SayHello();
            request.setName("John");

            SayHelloResponse response = stub.sayHello(request);
            System.out.println("Response: " + response.getGreeting());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}