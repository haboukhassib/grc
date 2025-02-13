package com.company.grc.view.newproductactivity;

import com.company.grc.entity.NewProductActivity;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "newProductActivities/:id", layout = MainView.class)
@ViewController(id = "NewProductActivity.detail")
@ViewDescriptor(path = "new-product-activity-detail-view.xml")
@EditedEntityContainer("newProductActivityDc")
public class NewProductActivityDetailView extends StandardDetailView<NewProductActivity> {
}