package com.seurity3.spring_security3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
    User findByUsername(String username);   
    
}
