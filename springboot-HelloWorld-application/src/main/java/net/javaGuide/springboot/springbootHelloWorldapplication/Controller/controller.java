package net.javaGuide.springboot.springbootHelloWorldapplication.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaGuide.springboot.springbootHelloWorldapplication.Greeting;

//甚麼事RestController??
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/api/v1")
public class controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
         return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}