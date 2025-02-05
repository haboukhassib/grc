package com.company.grc.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Month implements EnumClass<Integer> {

    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    private final Integer id;

    Month(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Month fromId(Integer id) {
        for (Month at : Month.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}