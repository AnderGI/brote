package com.andergi.javadddtemplate.src.shared.infrastructure.faker;

import net.datafaker.Faker;

public final class FakerUuidObjectMother {
    private static net.datafaker.Faker faker = new Faker();

    public static String random() {
        return faker.internet().uuid();
    }
}
