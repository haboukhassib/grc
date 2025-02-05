package com.company.grc.view.regulatorymonitoring;

import com.company.grc.entity.RegulatoryMonitoring;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "regulatoryMonitorings/:id", layout = MainView.class)
@ViewController(id = "RegulatoryMonitoring.detail")
@ViewDescriptor(path = "regulatory-monitoring-detail-view.xml")
@EditedEntityContainer("regulatoryMonitoringDc")
public class RegulatoryMonitoringDetailView extends StandardDetailView<RegulatoryMonitoring> {
}