
package com.example.microservice.domain.services;

import com.example.microservice.domain.model.User;
import com.example.microservice.infrastructure.repository.UserRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryImpl userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id);
    }
}
