package com.andergi.javadddtemplate.src.backoffice.user.application.register_user;

import com.andergi.javadddtemplate.src.backoffice.user.domain.User;
import com.andergi.javadddtemplate.src.backoffice.user.domain.UserRepository;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;

@Service
public final class UserRegistrar {

    private final UserRepository repository;

    public UserRegistrar(final UserRepository userRepository) {
        this.repository = userRepository;
    }

    public void register(final RegisterUserCommand command) throws IllegalArgumentException {
        this.repository.save(new User(command.id()));
    }
}
