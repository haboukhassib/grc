package com.company.grc.view.reporting;

import com.company.grc.app.GridActionsHelper;
import com.company.grc.entity.Reporting;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.propertyfilter.PropertyFilter;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "reportings", layout = MainView.class)
@ViewController(id = "Reporting.list")
@ViewDescriptor(path = "reporting-list-view.xml")
@LookupComponent("reportingsDataGrid")
@DialogMode(width = "64em")
public class ReportingListView extends StandardListView<Reporting> {

    @ViewComponent
    private PropertyFilter organizationFilter;
    @ViewComponent
    private PropertyFilter yearFilter;
    @ViewComponent
    private PropertyFilter quarterFilter;
    @ViewComponent
    private CollectionLoader<Reporting> reportingsDl;

    @ViewComponent
    private DataGrid<Reporting> reportingsDataGrid;

    @Autowired
    private GridActionsHelper gridActionsHelper;

    @Subscribe
    public void onInit(final InitEvent event) {
        gridActionsHelper.addEditAndDeleteButtons(reportingsDataGrid, this, Reporting.class);
    }

    @Subscribe("clearFilterAction")
    public void onClearFilterAction(final ActionPerformedEvent event) {
        organizationFilter.clear();
        reportingsDl.load();
    }

}