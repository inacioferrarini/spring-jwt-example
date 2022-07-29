package com.infoworld.jwt.security.controllers;

import com.infoworld.jwt.security.models.User;
import com.infoworld.jwt.security.services.authentication.UserAuthenticationService;
import com.infoworld.jwt.security.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/public")
final class wUserController {

    @Autowired
    UserAuthenticationService authentication;
    @Autowired
    UserService users;

    @GetMapping("/foo")
    String foo() {
        return "Foobar";
    }

    @PostMapping("/register")
    String register(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        users.save(User.builder()
                       .id(username)
                       .username(username)
                       .password(password)
                       .build()
        );

        return authentication.login(
                                     username,
                                     password
                             )
                             .orElseThrow(
                                     () -> new RuntimeException("invalid login and/or password")
                             );
    }

    @PostMapping("/login")
    String login(
            @RequestBody Map<String, String> body
    ) {
        System.out.println("/login: " + body);
        return authentication
                .login(
                        body.get("username"),
                        body.get("password")
                )
                .orElseThrow(
                        () -> new RuntimeException("invalid login and/or password")
                );
    }

}
