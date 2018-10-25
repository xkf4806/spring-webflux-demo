package com.example.webflux.springwebfluxdemo.service;

import com.example.webflux.springwebfluxdemo.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xinj.x
 */
public interface UserService {
    Flux<User> list();
    Flux<User> getById(final Flux<String> ids);
    Mono<User> getById(final String id);
    Mono<User> createOrUpdate(final User user);
    Mono<User> delete(final String id);
}
