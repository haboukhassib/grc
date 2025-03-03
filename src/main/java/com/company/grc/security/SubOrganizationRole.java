package com.company.grc.security;

import com.company.grc.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "SubOrganizationRole", code = SubOrganizationRole.CODE)
public interface SubOrganizationRole {
    String CODE = "sub-organization-role";

    @EntityAttributePolicy(entityClass = AuditRecommendation.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = AuditRecommendation.class, actions = EntityPolicyAction.ALL)
    void auditRecommendation();

    @EntityAttributePolicy(entityClass = RegulatoryMonitoring.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = RegulatoryMonitoring.class, actions = EntityPolicyAction.ALL)
    void regulatoryMonitoring();

    @EntityAttributePolicy(entityClass = Reporting.class, attributes = "user", action = EntityAttributePolicyAction.VIEW)
    @EntityAttributePolicy(entityClass = Reporting.class, attributes = {"id", "year", "quarter", "org1Int", "org2Int", "org3Int", "org4Txt", "kyc1Int", "kyc2Int", "kyc3Int", "kyc4Int", "kyc5Int", "kyc6Int", "kyc7Int", "kyc8Int", "kyc9Int", "alert1Int", "alert2Int", "alert3Int", "alert4Int", "alert5Int", "alert6Int", "alert7Int", "alert8Int", "alert9Int", "filtrageClient1Int", "filtrageClient2Int", "filtrageClient3Int", "filtrageClient4Int", "filtrageTran1Int", "filtrageTran2Int", "regulatoryMonitoring", "auditRecommendation", "organization"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Reporting.class, actions = EntityPolicyAction.ALL)
    void reporting();

    @MenuPolicy(menuIds = "Reporting.list")
    @ViewPolicy(viewIds = {"Reporting.list", "AlertFragment", "Audit_.detail", "Audit_.list", "FiltrageFragment", "kycFragment", "MainView", "LoginView", "OrganizationFragment", "RegulatoryMonitoring.detail", "RegulatoryMonitoring.list", "Reporting.detail", "AuditRecommendation.detail", "AuditRecommendation.list", "AuditrecommendationFragment", "CentifFragment", "CtrlconfFragment", "FatcaFragment", "IncidentTool.detail", "IncidentTool.list", "IncidenttoolFragment", "NewProductActivity.detail", "NewProductActivity.list", "NewproductactivityFragment", "PdpFragment", "RegulatorymonitoringFragment", "SanctionPenalty.detail", "SanctionPenalty.list", "SanctionpenaltyFragment", "TrainingAwareness.detail", "TrainingAwareness.list", "TrainingawarenessFragment", "headerPropertyFilterLayout", "flowui_AddConditionView", "flowui_GroupFilterCondition.detail", "flowui_JpqlFilterCondition.detail", "flowui_PropertyFilterCondition.detail", "inputDialog", "multiValueSelectDialog", "flowui_DateIntervalDialog", "FragmentRenderer"})
    void screens();

    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Organization.class, actions = EntityPolicyAction.READ)
    void organization();

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