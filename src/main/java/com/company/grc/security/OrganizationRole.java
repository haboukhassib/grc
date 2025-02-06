package com.company.grc.security;

import com.company.grc.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "OrganizationRole", code = OrganizationRole.CODE)
public interface OrganizationRole {
    String CODE = "organization-role";

    @EntityAttributePolicy(entityClass = AuditRecommendation.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = AuditRecommendation.class, actions = EntityPolicyAction.ALL)
    void auditRecommendation();

    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Organization.class, actions = EntityPolicyAction.ALL)
    void organization();

    @EntityAttributePolicy(entityClass = RegulatoryMonitoring.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = RegulatoryMonitoring.class, actions = EntityPolicyAction.ALL)
    void regulatoryMonitoring();

    @EntityAttributePolicy(entityClass = Reporting.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Reporting.class, actions = EntityPolicyAction.ALL)
    void reporting();

    @EntityAttributePolicy(entityClass = User.class, attributes = {"username", "password", "firstName", "lastName", "email", "active", "timeZoneId", "id", "version", "*"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = User.class, actions = EntityPolicyAction.ALL)
    void user();

    @ViewPolicy(viewIds = {"Organization.list", "User.list", "Organization.detail", "AlertFragment", "Audit_.detail", "Audit_.list", "FiltrageFragment", "kycFragment", "LoginView", "MainView", "OrganizationFragment", "RegulatoryMonitoring.detail", "Reporting.detail", "Reporting.list", "RegulatoryMonitoring.list", "User.detail"})
    @MenuPolicy(menuIds = {"Reporting.list", "Organization.list", "User.list"})
    void screens();
}