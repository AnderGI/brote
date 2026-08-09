package com.andergi.javadddtemplate.src.shared.infrastructure.faker;

import com.github.javafaker.Faker;

public final class FakerUuidObjectMother {
    private static Faker faker = new Faker();

    public static String random() {
        return faker.internet().uuid();
    }
}
