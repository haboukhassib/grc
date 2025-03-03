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

    @ViewPolicy(viewIds = {"Reporting.list", "Dashboard", "Organization.list", "User.list", "flowui_DateIntervalDialog", "flowui_PropertyFilterCondition.detail", "flowui_JpqlFilterCondition.detail", "flowui_AddConditionView", "flowui_GroupFilterCondition.detail", "headerPropertyFilterLayout", "inputDialog", "multiValueSelectDialog", "resetPasswordView", "changePasswordView", "MainView", "User.detail", "LoginView", "Organization.detail", "RegulatoryMonitoring.list", "RegulatoryMonitoring.detail", "Reporting.detail", "kycFragment", "AuditRecommendation.list", "AuditRecommendation.detail", "NewProductActivity.list", "NewProductActivity.detail", "SanctionPenalty.list", "SanctionPenalty.detail", "TrainingAwareness.list", "TrainingAwareness.detail", "IncidentTool.list", "IncidentTool.detail", "AlertFragment", "PdpFragment", "RegulatorymonitoringFragment", "NewproductactivityFragment", "SanctionpenaltyFragment", "AuditrecommendationFragment", "OrganizationFragment", "CtrlconfFragment", "IncidenttoolFragment", "FragmentRenderer", "FiltrageFragment", "CentifFragment", "TrainingawarenessFragment", "FatcaFragment"})
    @MenuPolicy(menuIds = {"Reporting.list", "Dashboard", "Organization.list", "User.list"})
    void screens();

    @EntityAttributePolicy(entityClass = IncidentTool.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = IncidentTool.class, actions = EntityPolicyAction.ALL)
    void incidentTool();

    @EntityAttributePolicy(entityClass = NewProductActivity.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = NewProductActivity.class, actions = EntityPolicyAction.ALL)
    void newProductActivity();

    @EntityAttributePolicy(entityClass = SanctionPenalty.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = SanctionPenalty.class, actions = EntityPolicyAction.ALL)
    void sanctionPenalty();

    @EntityAttributePolicy(entityClass = TrainingAwareness.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = TrainingAwareness.class, actions = EntityPolicyAction.ALL)
    void trainingAwareness();
}