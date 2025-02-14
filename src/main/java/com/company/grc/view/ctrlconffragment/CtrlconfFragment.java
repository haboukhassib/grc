package com.company.grc.view.ctrlconffragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("ctrlconf-fragment.xml")
public class CtrlconfFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> ctrlConf1IntField;

    @ViewComponent
    private TypedTextField<Integer> ctrlConf2IntField;

    @ViewComponent
    private TypedTextField<Integer> ctrlConf3IntField;

    @ViewComponent
    private TypedTextField<Integer> ctrlConf4IntField;

    @ViewComponent
    private TypedTextField<Integer> ctrlConf5IntField;

    @ViewComponent
    private TypedTextField<Integer> ctrlConf6IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, ctrlConf1IntField, ctrlConf2IntField, ctrlConf3IntField, ctrlConf4IntField, ctrlConf5IntField, ctrlConf6IntField);
        ctrlConf1IntField.addValueChangeListener(e -> updateState(details));
        ctrlConf2IntField.addValueChangeListener(e -> updateState(details));
        ctrlConf3IntField.addValueChangeListener(e -> updateState(details));
        ctrlConf4IntField.addValueChangeListener(e -> updateState(details));
        ctrlConf5IntField.addValueChangeListener(e -> updateState(details));
        ctrlConf6IntField.addValueChangeListener(e -> updateState(details));
        }

    public void updateState(Details details) {
        viewUtil.setIcon(details, ctrlConf1IntField, ctrlConf2IntField, ctrlConf3IntField, ctrlConf4IntField, ctrlConf5IntField, ctrlConf6IntField);
    }
}