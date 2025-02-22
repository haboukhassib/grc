package com.company.grc.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Quarter implements EnumClass<Integer> {

    QUARTER1(1),
    QUARTER2(2),
    QUARTER3(3),
    QUARTER4(4);

    private final Integer id;

    Quarter(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Quarter fromId(Integer id) {
        for (Quarter at : Quarter.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}