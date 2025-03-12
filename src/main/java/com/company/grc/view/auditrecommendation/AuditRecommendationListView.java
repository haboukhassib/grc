package com.company.grc.view.auditrecommendation;

import com.company.grc.entity.AuditRecommendation;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;


@Route(value = "auditRecommendations", layout = MainView.class)
@ViewController(id = "AuditRecommendation.list")
@ViewDescriptor(path = "audit-recommendation-list-view.xml")
@LookupComponent("auditRecommendationsDataGrid")
@DialogMode(width = "64em")
public class AuditRecommendationListView extends StandardListView<AuditRecommendation> {
    @ViewComponent
    private DataGrid<AuditRecommendation> auditRecommendationsDataGrid;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Downloader downloader;

    @Subscribe
    public void onInit(final InitEvent event) {
        auditRecommendationsDataGrid.addComponentColumn(attachment -> {
            Button downloadButton = uiComponents.create(Button.class);
            downloadButton.setIcon(new Icon(VaadinIcon.DOWNLOAD));

            if (attachment.getAttachment() == null) {
                downloadButton.setEnabled(false);
            }

            downloadButton.addClickListener(e -> {
                downloader.download(attachment.getAttachment());
            });

            return downloadButton;
        });
    }

}