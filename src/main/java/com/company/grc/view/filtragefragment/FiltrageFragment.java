package com.company.grc.view.filtragefragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("filtrage-fragment.xml")
public class FiltrageFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> filtrageClient1IntField;

    @ViewComponent
    private TypedTextField<Integer> filtrageClient2IntField;

    @ViewComponent
    private TypedTextField<Integer> filtrageClient3IntField;

    @ViewComponent
    private TypedTextField<Integer> filtrageClient4IntField;

    @ViewComponent
    private TypedTextField<Integer> filtrageTran1IntField;

    @ViewComponent
    private TypedTextField<Integer> filtrageTran2IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, filtrageClient1IntField, filtrageClient2IntField, filtrageClient3IntField, filtrageClient4IntField, filtrageTran1IntField, filtrageTran2IntField);
        filtrageClient1IntField.addValueChangeListener(e -> updateState(details));
        filtrageClient2IntField.addValueChangeListener(e -> updateState(details));
        filtrageClient3IntField.addValueChangeListener(e -> updateState(details));
        filtrageClient4IntField.addValueChangeListener(e -> updateState(details));
        filtrageTran1IntField.addValueChangeListener(e -> updateState(details));
        filtrageTran2IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.setIcon(details, filtrageClient1IntField, filtrageClient2IntField, filtrageClient3IntField, filtrageClient4IntField, filtrageTran1IntField, filtrageTran2IntField);
    }


}