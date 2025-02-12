package com.company.grc.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "ORGANIZATION", indexes = {
        @Index(name = "IDX_ORGANIZATION_UNQ", columnList = "NAME, MAIN_USER_ID", unique = true)
})
@Entity
public class Organization {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;
    @Column(name = "ORGANIZATION_TYPE", nullable = false)
    @NotNull
    private String organizationType;
    @NotNull
    @Column(name = "COUNTRY", nullable = false)
    private String country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAIN_USER_ID")
    private User mainUser;

    public User getMainUser() {
        return mainUser;
    }

    public void setMainUser(User mainUser) {
        this.mainUser = mainUser;
    }

    public Country getCountry() {
        return country == null ? null : Country.fromId(country);
    }

    public void setCountry(Country country) {
        this.country = country == null ? null : country.getId();
    }

    public OrganizationType getOrganizationType() {
        return organizationType == null ? null : OrganizationType.fromId(organizationType);
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}