package com.company.grc.view.sanctionpenalty;

import com.company.grc.entity.SanctionPenalty;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "sanctionPenalties", layout = MainView.class)
@ViewController(id = "SanctionPenalty.list")
@ViewDescriptor(path = "sanction-penalty-list-view.xml")
@LookupComponent("sanctionPenaltiesDataGrid")
@DialogMode(width = "64em")
public class SanctionPenaltyListView extends StandardListView<SanctionPenalty> {
}