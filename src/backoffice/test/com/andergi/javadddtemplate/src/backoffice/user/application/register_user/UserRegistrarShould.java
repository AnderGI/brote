package com.andergi.javadddtemplate.src.backoffice.user.application.register_user;

import com.andergi.javadddtemplate.src.backoffice.user.domain.User;
import com.andergi.javadddtemplate.src.backoffice.user.domain.UserObjectMother;
import com.andergi.javadddtemplate.src.backoffice.user.domain.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserRegistrarShould {

    private UserRepository userRepository;
    private UserRegistrar userRegistrar;

    @BeforeAll
    void setup() {
        this.userRepository = mock(UserRepository.class);
        this.userRegistrar = new UserRegistrar(userRepository);
    }

    @Test
    void register_a_valid_user() {
        final User user = UserObjectMother.random();
        final RegisterUserCommand command = new RegisterUserCommand(user.id());
        userRegistrar.register(command);

        verify(userRepository, times(1)).save(user);

    }

    @Test
    void throw_an_exception_with_invalid_user_id() {
        assertThrows(IllegalArgumentException.class, () -> userRegistrar.register(
                new RegisterUserCommand("invalid-uuid")));
    }
}