package com.infoworld.jwt.security.services.authentication;

import com.infoworld.jwt.security.models.User;

import java.util.Optional;

public interface UserAuthenticationService {

    Optional<String> login(
            String username,
            String password
    );

    Optional<User> findByToken(String token);

    void logout(User user);

}