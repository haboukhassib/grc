package com.company.grc.view.pdpfragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("pdp-fragment.xml")
public class PdpFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> pdp1IntField;

    @ViewComponent
    private TypedTextField<Integer> pdp2IntField;

    @ViewComponent
    private TypedTextField<Integer> pdp3IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, pdp1IntField, pdp2IntField, pdp3IntField);
        pdp1IntField.addValueChangeListener(e -> updateState(details));
        pdp2IntField.addValueChangeListener(e -> updateState(details));
        pdp3IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.setIcon(details, pdp1IntField, pdp2IntField, pdp3IntField);
    }
}