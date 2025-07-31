package com.graphql.graphql_example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired  
    private UserService userService;

    @QueryMapping
    public User getUser(@Argument String id) {
        return userService.getUserById(id);
    }

    @QueryMapping
    public String hello() {
        return "Hello GraphQL!";
    }
}
