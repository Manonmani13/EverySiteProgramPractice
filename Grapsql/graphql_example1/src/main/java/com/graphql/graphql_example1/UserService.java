package com.graphql.graphql_example1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
     private Map<String, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put("1", new User("1", "Alice", "alice@example.com"));
        userMap.put("2", new User("2", "Bob", "bob@example.com"));
    }

    public User getUserById(String id) {
        return userMap.get(id);
    }
}
