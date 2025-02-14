package com.company.grc.view.centiffragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("centif-fragment.xml")
public class CentifFragment extends Fragment<JmixFormLayout> {
    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> centif1IntField;

    @ViewComponent
    private TypedTextField<Integer> centif2IntField;

    @ViewComponent
    private TypedTextField<Integer> centif3IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, centif1IntField, centif2IntField, centif3IntField);
        centif1IntField.addValueChangeListener(e -> updateState(details));
        centif2IntField.addValueChangeListener(e -> updateState(details));
        centif3IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.setIcon(details, centif1IntField, centif2IntField, centif3IntField);
    }
}