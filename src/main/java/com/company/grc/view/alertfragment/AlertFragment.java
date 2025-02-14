package com.company.grc.view.alertfragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("alert-fragment.xml")
public class AlertFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> alert1IntField;

    @ViewComponent
    private TypedTextField<Integer> alert2IntField;

    @ViewComponent
    private TypedTextField<Integer> alert3IntField;

    @ViewComponent
    private TypedTextField<Integer> alert4IntField;

    @ViewComponent
    private TypedTextField<Integer> alert5IntField;

    @ViewComponent
    private TypedTextField<Integer> alert6IntField;

    @ViewComponent
    private TypedTextField<Integer> alert7IntField;

    @ViewComponent
    private TypedTextField<Integer> alert8IntField;

    @ViewComponent
    private TypedTextField<Integer> alert9IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, alert3IntField, alert4IntField, alert5IntField, alert7IntField, alert8IntField, alert9IntField);
        alert3IntField.addValueChangeListener(e -> updateState(details));
        alert4IntField.addValueChangeListener(e -> updateState(details));
        alert5IntField.addValueChangeListener(e -> updateState(details));
        alert7IntField.addValueChangeListener(e -> updateState(details));
        alert8IntField.addValueChangeListener(e -> updateState(details));
        alert9IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.updateSum(alert2IntField, alert3IntField, alert4IntField, alert5IntField);
        viewUtil.updateSum(alert6IntField, alert7IntField, alert8IntField, alert9IntField);
        viewUtil.updateSum(alert1IntField, alert2IntField, alert6IntField);
        viewUtil.setIcon(details, alert3IntField, alert4IntField, alert5IntField, alert7IntField, alert8IntField, alert9IntField);
    }

}