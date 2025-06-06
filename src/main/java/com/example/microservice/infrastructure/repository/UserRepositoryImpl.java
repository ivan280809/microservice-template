
package com.example.microservice.infrastructure.repository;

import com.example.microservice.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl {

    public User findById(Long id) {
        return new User(id, "testuser", "test@example.com");
    }
}
