package com.company.grc.view.centiffragment;


import com.company.grc.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "centif-fragment", layout = MainView.class)
@ViewController(id = "CentifFragment")
@ViewDescriptor(path = "centif-fragment.xml")
public class CentifFragment extends StandardView {
}