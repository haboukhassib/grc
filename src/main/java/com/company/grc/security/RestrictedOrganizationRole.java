package com.company.grc.security;

import com.company.grc.entity.Organization;
import com.company.grc.entity.Reporting;
import io.jmix.data.impl.jpql.JpqlSyntaxException;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "RestrictedOrganizationRole", code = RestrictedOrganizationRole.CODE)
public interface RestrictedOrganizationRole {
    String CODE = "restricted-organization-role";

//    @JpqlRowLevelPolicy(entityClass = Reporting.class, where = "{E}.user.id	 = :current_user_id")
//    void reporting();

    @JpqlRowLevelPolicy(
            entityClass = Reporting.class,
            join = "JOIN {E}.organization o",  // Use the relationship field with an alias
            where = "o.mainUser.id = :current_user_id")
    void reporting1();


}