package com.andergi.javadddtemplate.src.shared.domain.value_objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValueObject extends ValueObject<Date>{

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    protected DateValueObject(final Date value) {
        super(value);
    }

    @Override
    public Date value() {
        return super.value();
    }

    @Override
    public String toString() {
        return this.sdf.format(this.value());
    }
}
