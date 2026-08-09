package com.andergi.javadddtemplate.src.shared.domain.value_objects;


import java.util.Date;
import java.util.Objects;
import java.util.Set;

public abstract class ValueObject<PrimitiveWrapperClass> {

    private static final Set<Class<?>> ALLOWED_TYPES = Set.of(
            String.class,
            Integer.class,
            Double.class,
            Float.class,
            Boolean.class,
            Byte.class,
            Character.class,
            Long.class,
            Short.class,
            Date.class
    );

    private final PrimitiveWrapperClass value;

    protected ValueObject(final PrimitiveWrapperClass value) {
        ensureValueIsDefined(value);
        ensureAllowedType(value);
        this.value = value;
    }

    private void ensureValueIsDefined(final PrimitiveWrapperClass value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
    }

    private void ensureAllowedType(final PrimitiveWrapperClass value) {
        if (!ALLOWED_TYPES.contains(value.getClass())) {
            throw new IllegalArgumentException();
        }
    }

    public PrimitiveWrapperClass value()  {
        return this.value;
    }

    public String toString() {
        return this.value.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        ValueObject<?> that = (ValueObject<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
