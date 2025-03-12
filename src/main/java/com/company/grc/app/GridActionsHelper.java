package com.company.grc.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.DataManager;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.view.View;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class GridActionsHelper {

    private final ViewNavigators viewNavigators;
    private final DataManager dataManager;
    private final Notifications notifications;

    @Autowired
    public GridActionsHelper(ViewNavigators viewNavigators, DataManager dataManager, Notifications notifications) {
        this.viewNavigators = viewNavigators;
        this.dataManager = dataManager;
        this.notifications = notifications;
    }

    public <T> void addEditAndDeleteButtons(DataGrid<T> grid, View<?> view, Class<T> entityClass) {
        grid.addComponentColumn(entity -> {
            HorizontalLayout actionsLayout = new HorizontalLayout();

            // Edit Button
            Button editButton = new Button(new Icon(VaadinIcon.EDIT));
            editButton.addThemeVariants(ButtonVariant.LUMO_ICON, ButtonVariant.LUMO_SMALL);
            editButton.addClickListener(e ->
                    viewNavigators.detailView(view, entityClass)  // Explicit class type
                            .editEntity(entityClass.cast(entity))     // Explicit cast
                            .navigate()
            );

            // Delete Button
            Button deleteButton = new Button(new Icon(VaadinIcon.TRASH));
            deleteButton.addThemeVariants(ButtonVariant.LUMO_ICON, ButtonVariant.LUMO_SMALL, ButtonVariant.LUMO_ERROR);
            deleteButton.addClickListener(e -> confirmDelete(entity, grid));

            actionsLayout.add(editButton, deleteButton);
            return actionsLayout;
        }).setAutoWidth(true).setFlexGrow(0).setSortable(false);
    }

    private <T> void confirmDelete(T entity, DataGrid<T> grid) {
        ConfirmDialog dialog = new ConfirmDialog(
                "Delete record",
                "Are you sure you want to delete this record?",
                "Delete",
                e -> {
                    dataManager.remove(entity);
                    grid.getDataProvider().refreshAll();
                    notifications.create("Record deleted").withType(Notifications.Type.WARNING).show();
                },
                "Cancel",
                e -> {}
        );
        dialog.open();
    }
}
