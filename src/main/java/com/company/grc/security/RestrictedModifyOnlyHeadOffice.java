package com.company.grc.security;

import com.company.grc.entity.Reporting;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.security.model.RowLevelBiPredicate;
import io.jmix.security.model.RowLevelPolicyAction;
import io.jmix.security.role.annotation.PredicateRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;
import org.springframework.context.ApplicationContext;

@RowLevelRole(name = "RestrictedModifyOnlyHeadOffice", code = RestrictedModifyOnlyHeadOffice.CODE)
public interface RestrictedModifyOnlyHeadOffice {
    String CODE = "restricted-modify-only-head-office";
        @PredicateRowLevelPolicy(
                entityClass = Reporting.class,
                actions = {RowLevelPolicyAction.UPDATE})
        default RowLevelBiPredicate<Reporting, ApplicationContext> modifyOnlyHeadOffice() {
            return (reporting, applicationContext) -> {
                CurrentAuthentication currentAuthentication = applicationContext.getBean(CurrentAuthentication.class);
                return reporting.getUser().getUsername().equals(currentAuthentication.getUser().getUsername());
            };
        }

    }
