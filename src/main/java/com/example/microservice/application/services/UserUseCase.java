
package com.example.microservice.application.services;

import com.example.microservice.application.dtos.UserDTO;
import com.example.microservice.domain.model.User;
import com.example.microservice.domain.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserUseCase {

    private final UserService userService;

    public UserDTO getUser(Long id) {
        User user = userService.getUser(id);
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
