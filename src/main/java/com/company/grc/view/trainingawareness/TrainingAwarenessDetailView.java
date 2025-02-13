package com.company.grc.view.trainingawareness;

import com.company.grc.entity.TrainingAwareness;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "trainingAwarenesses/:id", layout = MainView.class)
@ViewController(id = "TrainingAwareness.detail")
@ViewDescriptor(path = "training-awareness-detail-view.xml")
@EditedEntityContainer("trainingAwarenessDc")
public class TrainingAwarenessDetailView extends StandardDetailView<TrainingAwareness> {
}