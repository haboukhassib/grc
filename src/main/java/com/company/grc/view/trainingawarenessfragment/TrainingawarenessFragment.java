package com.company.grc.view.trainingawarenessfragment;

import com.company.grc.entity.TrainingAwareness;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("trainingawareness-fragment.xml")
public class TrainingawarenessFragment extends Fragment<VerticalLayout> {

    @ViewComponent
    private DataGrid<TrainingAwareness> trainingAwarenessesDataGrid;

    public DataGrid<TrainingAwareness> getTrainingAwarenessesDataGrid() {
        return trainingAwarenessesDataGrid;
    }
}