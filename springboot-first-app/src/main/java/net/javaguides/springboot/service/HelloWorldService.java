package net.javaguides.springboot.service;

import net.javaguides.springboot.controller.HelloWorldController;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
