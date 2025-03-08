package com.company.grc.view.dashboard;


import com.company.grc.view.main.MainView;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.supersetflowui.component.SupersetDashboard;
import org.springframework.beans.factory.annotation.Value;

@Route(value = "dashboard", layout = MainView.class)
@ViewController(id = "Dashboard")
@ViewDescriptor(path = "dashboard.xml")
@Uses(SupersetDashboard.class)
public class Dashboard extends StandardView {

    @Value("${superset.dashboard.embeddedId}")
    private String embId;

    @ViewComponent
    private SupersetDashboard dashboard;

    @Subscribe
    public void onInit(final InitEvent event) {
        dashboard.setEmbeddedId(embId);
        System.out.println(embId);
         }
}