package com.company.grc.view.sanctionpenaltyfragment;

import com.company.grc.entity.SanctionPenalty;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("sanctionpenalty-fragment.xml")
public class SanctionpenaltyFragment extends Fragment<VerticalLayout> {

    @ViewComponent
    private DataGrid<SanctionPenalty> sanctionPenaltiesDataGrid;

    public DataGrid<SanctionPenalty> getSanctionPenaltiesDataGrid() {
        return sanctionPenaltiesDataGrid;
    }
}

