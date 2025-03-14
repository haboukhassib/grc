package com.company.grc.view.regulatorymonitoringfragment;

import com.company.grc.entity.RegulatoryMonitoring;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("regulatorymonitoring-fragment.xml")
public class RegulatorymonitoringFragment extends Fragment<VerticalLayout> {

    @ViewComponent
    private DataGrid<RegulatoryMonitoring> regulatoryMonitoringDataGrid;

    public DataGrid<RegulatoryMonitoring> getRegulatoryMonitoringDataGrid() {
        return regulatoryMonitoringDataGrid;
    }
}