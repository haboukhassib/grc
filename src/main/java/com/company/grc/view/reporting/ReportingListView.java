package com.company.grc.view.reporting;

import com.company.grc.entity.Reporting;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.propertyfilter.PropertyFilter;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;


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

    @Subscribe("clearFilterAction")
    public void onClearFilterAction(final ActionPerformedEvent event) {
        organizationFilter.clear();
//        yearFilter.clear();
//        quarterFilter.clear();
        reportingsDl.load();
    }

}