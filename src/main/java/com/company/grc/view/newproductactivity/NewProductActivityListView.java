package com.company.grc.view.newproductactivity;

import com.company.grc.entity.NewProductActivity;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "newProductActivities", layout = MainView.class)
@ViewController(id = "NewProductActivity.list")
@ViewDescriptor(path = "new-product-activity-list-view.xml")
@LookupComponent("newProductActivitiesDataGrid")
@DialogMode(width = "64em")
public class NewProductActivityListView extends StandardListView<NewProductActivity> {
}