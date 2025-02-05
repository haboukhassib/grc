package com.company.grc.view.kycfragment;

import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import org.springframework.stereotype.Component;

@ViewController("kycFragment")
@FragmentDescriptor("kyc-fragment.xml")
public class KycFragment extends Fragment<JmixFormLayout> {

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


    public TypedTextField<Integer> getKyc1IntField() {
        return kyc1IntField;
    }
    public TypedTextField<Integer> getKyc2IntField() {
        return kyc2IntField;
    }
    public TypedTextField<Integer> getKyc3IntField() {
        return kyc3IntField;
    }
    public TypedTextField<Integer> getKyc4IntField() {
        return kyc4IntField;
    }
    public TypedTextField<Integer> getKyc5IntField() {
        return kyc5IntField;
    }
    public TypedTextField<Integer> getKyc6IntField() {
        return kyc6IntField;
    }
    public TypedTextField<Integer> getKyc7IntField() {
        return kyc7IntField;
    }
    public TypedTextField<Integer> getKyc8IntField() {
        return kyc8IntField;
    }
    public TypedTextField<Integer> getKyc9IntField() {
        return kyc9IntField;
    }


    }