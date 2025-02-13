package com.company.grc.view.incidenttool;

import com.company.grc.entity.IncidentTool;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "incidentTools", layout = MainView.class)
@ViewController(id = "IncidentTool.list")
@ViewDescriptor(path = "incident-tool-list-view.xml")
@LookupComponent("incidentToolsDataGrid")
@DialogMode(width = "64em")
public class IncidentToolListView extends StandardListView<IncidentTool> {
}