package com.infoworld.jwt.security.controllers.api;

import com.infoworld.jwt.security.services.authentication.UserAuthenticationService;
import com.infoworld.jwt.security.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    UserAuthenticationService authentication;

    @Autowired
    UserService users;

    @PostMapping("/api/security/login")
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
