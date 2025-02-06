package com.company.grc.view.regulatorymonitoring;

import com.company.grc.entity.RegulatoryMonitoring;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "regulatoryMonitorings", layout = MainView.class)
@ViewController(id = "RegulatoryMonitoring.list")
@ViewDescriptor(path = "regulatory-monitoring-list-view.xml")
@LookupComponent("regulatoryMonitoringsDataGrid")
@DialogMode(width = "64em")

public class RegulatoryMonitoringListView extends StandardListView<RegulatoryMonitoring> {
}