package com.company.grc.view.sanctionpenalty;

import com.company.grc.entity.SanctionPenalty;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "sanctionPenalties/:id", layout = MainView.class)
@ViewController(id = "SanctionPenalty.detail")
@ViewDescriptor(path = "sanction-penalty-detail-view.xml")
@EditedEntityContainer("sanctionPenaltyDc")
public class SanctionPenaltyDetailView extends StandardDetailView<SanctionPenalty> {
}