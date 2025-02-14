package com.company.grc.view.organizationfragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("organization-fragment.xml")
public class OrganizationFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> org1IntField;

    @ViewComponent
    private TypedTextField<Integer> org2IntField;

    @ViewComponent
    private TypedTextField<Integer> org3IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, org1IntField, org2IntField, org3IntField);
        org1IntField.addValueChangeListener(e -> updateState(details));
        org2IntField.addValueChangeListener(e -> updateState(details));
        org3IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.setIcon(details, org1IntField, org2IntField, org3IntField);
    }

}