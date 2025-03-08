package com.company.grc.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum OrganizationType implements EnumClass<String> {

    HEAD_OFFICE("A"),
    BRANCH("B"),
    SUBSIDIARY("C"),
    REPRESENTATIVE_OFFICE("D");

    private final String id;

    OrganizationType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OrganizationType fromId(String id) {
        for (OrganizationType at : OrganizationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}