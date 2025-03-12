package com.company.grc.view.auditrecommendationfragment;

import com.company.grc.entity.AuditRecommendation;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@FragmentDescriptor("auditrecommendation-fragment.xml")
public class AuditrecommendationFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private DataGrid<AuditRecommendation> auditRecommendationsDataGrid;

    public DataGrid<AuditRecommendation> getAuditRecommendationsDataGrid() {
        return auditRecommendationsDataGrid;
    }
}