package com.infoworld.jwt.security.services.user;

import com.infoworld.jwt.security.models.User;

import java.util.Optional;

public interface UserService {

  User save(User user);

  Optional<User> find(String id);

  Optional<User> findByUsername(String username);
}