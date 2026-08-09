package com.andergi.javadddtemplate.src.backoffice.user.domain;

public final class UserObjectMother {
    public static User create(final String id) {
        return new User(id);
    }

    public static User random() {
        return new User(UserIdMother.random().value());
    }
}
