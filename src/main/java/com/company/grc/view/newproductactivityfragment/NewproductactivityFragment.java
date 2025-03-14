package com.company.grc.view.newproductactivityfragment;

import com.company.grc.entity.NewProductActivity;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("newproductactivity-fragment.xml")
public class NewproductactivityFragment extends Fragment<VerticalLayout> {

    @ViewComponent
    private DataGrid<NewProductActivity> newProductActivitiesDataGrid;

    public DataGrid<NewProductActivity> getNewProductActivitiesDataGrid() {
        return newProductActivitiesDataGrid;
    }
}