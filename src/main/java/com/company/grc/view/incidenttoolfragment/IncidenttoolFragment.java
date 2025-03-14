package com.company.grc.view.incidenttoolfragment;

import com.company.grc.entity.AuditRecommendation;
import com.company.grc.entity.IncidentTool;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("incidenttool-fragment.xml")
public class IncidenttoolFragment extends Fragment<VerticalLayout> {

    @ViewComponent
    private DataGrid<IncidentTool> incidentToolsDataGrid;

    public DataGrid<IncidentTool> getIncidentToolsDataGrid() {
        return incidentToolsDataGrid;
    }
}