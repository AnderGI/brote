package com.andergi.javadddtemplate.src.shared.domain.value_objects;

import java.util.UUID;

public class UuidValueObject extends StringValueObject {

    public UuidValueObject(final String value) throws IllegalArgumentException {
        super(value);
        this.ensureValidUuid(value);
    }

    private void ensureValidUuid(final String id) throws IllegalArgumentException{
        UUID.fromString(id);
    }

}