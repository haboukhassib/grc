package com.company.grc.view.fatcafragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("fatca-fragment.xml")
public class FatcaFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> fatca1IntField;

    @ViewComponent
    private TypedTextField<Integer> fatca2IntField;

    @ViewComponent
    private TypedTextField<Integer> fatca3IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, fatca1IntField, fatca2IntField, fatca3IntField);
        fatca1IntField.addValueChangeListener(e -> updateState(details));
        fatca2IntField.addValueChangeListener(e -> updateState(details));
        fatca3IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.setIcon(details, fatca1IntField, fatca2IntField, fatca3IntField);
    }
}