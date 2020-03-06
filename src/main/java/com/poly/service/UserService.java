package com.poly.service;

import com.poly.model.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> findAll();

    Optional<User> findById(Long id);

    void save(User user);

    void delete(Long id);
}
