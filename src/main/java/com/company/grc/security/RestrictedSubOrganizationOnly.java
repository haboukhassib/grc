package com.company.grc.security;

import com.company.grc.entity.Reporting;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "RestrictedSubOrganizationOnly", code = RestrictedSubOrganizationOnly.CODE)
public interface RestrictedSubOrganizationOnly {
    String CODE = "restricted-sub-organization-only";

    @JpqlRowLevelPolicy(
            entityClass = Reporting.class,
            join = "JOIN {E}.organization o",
            where = "o.mainUser.id = :current_user_id")
    void reporting();
}