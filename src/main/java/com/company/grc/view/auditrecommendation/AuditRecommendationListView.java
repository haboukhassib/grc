package com.company.grc.view.auditrecommendation;

import com.company.grc.entity.AuditRecommendation;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "auditRecommendations", layout = MainView.class)
@ViewController(id = "Audit_.list")
@ViewDescriptor(path = "audit-recommendation-list-view.xml")
@LookupComponent("auditRecommendationsDataGrid")
@DialogMode(width = "64em")
public class AuditRecommendationListView extends StandardListView<AuditRecommendation> {
}