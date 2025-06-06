
package com.example.microservice.unit;

import com.example.microservice.application.dtos.UserDTO;
import com.example.microservice.application.services.UserUseCase;
import com.example.microservice.domain.model.User;
import com.example.microservice.domain.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class UserUseCaseTest {

    private UserService userService;
    private UserUseCase userUseCase;

    @BeforeEach
    void setUp() {
        userService = Mockito.mock(UserService.class);
        userUseCase = new UserUseCase(userService);
    }

    @Test
    void shouldReturnUserDTO() {
        User user = new User(1L, "testuser", "test@example.com");
        when(userService.getUser(1L)).thenReturn(user);

        UserDTO result = userUseCase.getUser(1L);

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getUsername()).isEqualTo("testuser");
        assertThat(result.getEmail()).isEqualTo("test@example.com");
    }
}
