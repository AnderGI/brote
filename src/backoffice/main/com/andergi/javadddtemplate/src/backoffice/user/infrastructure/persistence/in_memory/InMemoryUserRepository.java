package com.andergi.javadddtemplate.src.backoffice.user.infrastructure.persistence.in_memory;

import com.andergi.javadddtemplate.src.backoffice.user.domain.User;
import com.andergi.javadddtemplate.src.backoffice.user.domain.UserRepository;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public final class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();

    @Override
    public void save(User user) {
        database.put(user.id(), user);
    }
}
