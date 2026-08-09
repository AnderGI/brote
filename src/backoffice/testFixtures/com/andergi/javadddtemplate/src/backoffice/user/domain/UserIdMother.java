package com.andergi.javadddtemplate.src.backoffice.user.domain;


import com.andergi.javadddtemplate.src.shared.infrastructure.faker.FakerUuidObjectMother;

public final class UserIdMother {
    public static UserId create(final String id) {
        return new UserId(id);
    }
    public static UserId random() {
        return new UserId(FakerUuidObjectMother.random());
    }
}
