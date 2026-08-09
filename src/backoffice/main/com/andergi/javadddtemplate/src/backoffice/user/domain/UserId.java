package com.andergi.javadddtemplate.src.backoffice.user.domain;

import com.andergi.javadddtemplate.src.shared.domain.value_objects.UuidValueObject;

public final class UserId extends UuidValueObject {
    public UserId(String value) throws IllegalArgumentException {
        super(value);
    }
}
