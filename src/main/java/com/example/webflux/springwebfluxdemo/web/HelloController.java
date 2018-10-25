package com.example.webflux.springwebfluxdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author xinj.x
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Mono<String> sayHello() {
        return Mono.just("hello world");
    }
}
