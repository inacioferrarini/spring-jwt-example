package com.infoworld.jwt.security.services.token;

import java.util.Map;

public interface TokenService {
  String newToken(final Map<String, String> attributes);
  Map<String, String> verify(String token);
}

