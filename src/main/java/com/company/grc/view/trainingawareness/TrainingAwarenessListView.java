package com.company.grc.view.trainingawareness;

import com.company.grc.entity.TrainingAwareness;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "trainingAwarenesses", layout = MainView.class)
@ViewController(id = "TrainingAwareness.list")
@ViewDescriptor(path = "training-awareness-list-view.xml")
@LookupComponent("trainingAwarenessesDataGrid")
@DialogMode(width = "64em")
public class TrainingAwarenessListView extends StandardListView<TrainingAwareness> {
}