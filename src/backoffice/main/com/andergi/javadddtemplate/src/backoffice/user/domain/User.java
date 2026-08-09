package com.andergi.javadddtemplate.src.backoffice.user.domain;

import java.util.Objects;

public final class User {
    private UserId id;

    public User(String id) throws IllegalArgumentException {
        this.id = new UserId(id);
    }

    public String id() {
        return id.value();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
