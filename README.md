# About

Provides the basic configuration and code required to secure a RESTful API using a JWT token.

A RESTful endpoint is provided as sample.

# Project Structure

http://localhost:8000/api/security/register

http://localhost:8000/api/security/login




------------------------------------------------------------------------------
-- Security: Register
------------------------------------------------------------------------------
curl --location -i --request POST 'http://localhost:8080/api/security/register' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
-d '{"username":"Inacio","password":"123456"}'

------------------------------------------------------------------------------
-- Security: Login
------------------------------------------------------------------------------
curl --location -i --request POST 'http://localhost:8080/api/security/login' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
-d '{"username":"Inacio","password":"123456"}'

------------------------------------------------------------------------------
-- Protected Resource
------------------------------------------------------------------------------
curl --location -i --request GET 'http://localhost:8080/protected' \
--header 'Accept: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAA_6tWyiwuVrJSysxLyy_PL8pJUdJRykwsUbIyNDO1NDQytTA11VEqLU4tykvMTQWq88xLTM7MV6oFAMQuZwY4AAAA.cr3EvXedIrH-M2TUR4CUqDkvd5SrSmrbfZl6iM_WN-E'

# Usage


## Creates User


## Creates User



# External References

[RESTful API in Spring with Security Example](https://www.infoworld.com/article/3630107/how-to-secure-rest-with-spring-security.html)
