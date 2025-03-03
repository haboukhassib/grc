package com.company.grc.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Year implements EnumClass<Integer> {
    Y2024(2024),
    Y2025(2025),
    Y2026(2026),
    Y2027(2027);

    private final Integer id;

    Year(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Year fromId(Integer id) {
        for (Year at : Year.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}