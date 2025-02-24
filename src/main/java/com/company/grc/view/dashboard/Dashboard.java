package com.company.grc.view.dashboard;


import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "dashboard", layout = MainView.class)
@ViewController(id = "Dashboard")
@ViewDescriptor(path = "dashboard.xml")
public class Dashboard extends StandardView {
}