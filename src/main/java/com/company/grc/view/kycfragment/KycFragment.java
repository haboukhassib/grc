package com.company.grc.view.kycfragment;

import com.company.grc.app.ViewUtil;
import com.vaadin.flow.component.details.Details;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ViewController("kycFragment")
@FragmentDescriptor("kyc-fragment.xml")
public class KycFragment extends Fragment<JmixFormLayout> {

    private ViewUtil viewUtil = new ViewUtil();

    @ViewComponent
    private TypedTextField<Integer> kyc1IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc2IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc3IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc4IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc5IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc6IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc7IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc8IntField;

    @ViewComponent
    private TypedTextField<Integer> kyc9IntField;

    public void setDetailsIndicator(Details details) {
        viewUtil.setIcon(details, kyc3IntField, kyc4IntField, kyc5IntField, kyc7IntField, kyc8IntField, kyc9IntField);
        kyc3IntField.addValueChangeListener(e -> updateState(details));
        kyc4IntField.addValueChangeListener(e -> updateState(details));
        kyc5IntField.addValueChangeListener(e -> updateState(details));
        kyc7IntField.addValueChangeListener(e -> updateState(details));
        kyc8IntField.addValueChangeListener(e -> updateState(details));
        kyc9IntField.addValueChangeListener(e -> updateState(details));
    }

    public void updateState(Details details) {
        viewUtil.updateSum(kyc2IntField, kyc3IntField, kyc4IntField, kyc5IntField);
        viewUtil.updateSum(kyc6IntField, kyc7IntField, kyc8IntField, kyc9IntField);
        viewUtil.updateSum(kyc1IntField, kyc2IntField, kyc6IntField);
        viewUtil.setIcon(details, kyc3IntField, kyc4IntField, kyc5IntField, kyc7IntField, kyc8IntField, kyc9IntField);
    }
}