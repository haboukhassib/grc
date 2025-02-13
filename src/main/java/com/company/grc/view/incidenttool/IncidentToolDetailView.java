package com.company.grc.view.incidenttool;

import com.company.grc.entity.IncidentTool;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "incidentTools/:id", layout = MainView.class)
@ViewController(id = "IncidentTool.detail")
@ViewDescriptor(path = "incident-tool-detail-view.xml")
@EditedEntityContainer("incidentToolDc")
public class IncidentToolDetailView extends StandardDetailView<IncidentTool> {
}