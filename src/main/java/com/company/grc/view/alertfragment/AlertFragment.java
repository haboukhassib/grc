package com.company.grc.view.alertfragment;

import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;

@FragmentDescriptor("alert-fragment.xml")
public class AlertFragment extends Fragment<JmixFormLayout> {
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


    public TypedTextField<Integer> getalert1IntField() {
        return alert1IntField;
    }
    public TypedTextField<Integer> getalert2IntField() {
        return alert2IntField;
    }
    public TypedTextField<Integer> getalert3IntField() {
        return alert3IntField;
    }
    public TypedTextField<Integer> getalert4IntField() {
        return alert4IntField;
    }
    public TypedTextField<Integer> getalert5IntField() {
        return alert5IntField;
    }
    public TypedTextField<Integer> getalert6IntField() {
        return alert6IntField;
    }
    public TypedTextField<Integer> getalert7IntField() {
        return alert7IntField;
    }
    public TypedTextField<Integer> getalert8IntField() {
        return alert8IntField;
    }
    public TypedTextField<Integer> getalert9IntField() {
        return alert9IntField;
    }


}