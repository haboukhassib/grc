package com.company.grc.app;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.flowui.component.textfield.TypedTextField;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Stream;

@Component
public class ViewUtil {

    @SafeVarargs
    public final boolean isAllFieldsFilled(TypedTextField<Integer>... fields) {
        return Stream.of(fields).allMatch(field -> field.getTypedValue() != null);
    }

    @SafeVarargs
    public final void updateSum(TypedTextField<Integer> sumField, TypedTextField<Integer>... fields) {
        Integer sum = Stream.of(fields)
                .map(TypedTextField::getTypedValue)
                .filter(Objects::nonNull)
                .reduce(0, Integer::sum);
        sumField.setValue(String.valueOf(sum));
    }

    @SafeVarargs
    public final void setIcon(Details details, TypedTextField<Integer>... fields) {
        HorizontalLayout summary = new HorizontalLayout();
        Icon icon = VaadinIcon.EXCLAMATION_CIRCLE.create();
        icon.getStyle().set("width", "var(--lumo-icon-size-s)");
        icon.getStyle().set("height", "var(--lumo-icon-size-s)");
        icon.setColor("red");
        summary.add(details.getSummaryText());

        if (isAllFieldsFilled(fields)) {
            summary.remove(icon);
        } else {
            summary.add(icon);
        }
        details.setSummary(summary);
    }
}