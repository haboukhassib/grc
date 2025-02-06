package com.company.grc.view.reporting;

import com.company.grc.app.ViewUtil;
import com.company.grc.entity.Reporting;
import com.company.grc.entity.User;
import com.company.grc.view.alertfragment.AlertFragment;
import com.company.grc.view.kycfragment.KycFragment;
import com.company.grc.view.main.MainView;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.model.DataLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Route(value = "reportings/:id", layout = MainView.class)
@ViewController(id = "Reporting.detail")
@ViewDescriptor(path = "reporting-detail-view.xml")
@EditedEntityContainer("reportingDc")
public class ReportingDetailView extends StandardDetailView<Reporting> {


    @ViewComponent
    private DataLoader organizationDl;
    @Autowired
    private ViewUtil viewUtil;

    @ViewComponent
    private KycFragment kycFragment;

    @ViewComponent
    private Details kycDetails;

    @ViewComponent
    private AlertFragment alertFragment;

    @ViewComponent
    private Details alertDetails;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Reporting> event) {
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setUser(user);
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {

        String currentUsername = currentAuthentication.getUser().getUsername();

        if (Objects.equals(currentUsername, "admin")) {
            organizationDl.setQuery("select e from Organization e");
        } else {
        organizationDl.setParameter("current_user", currentUsername);
        }
            organizationDl.load();
        // Kyc details
        viewUtil.setIcon(kycDetails, kycFragment.getKyc3IntField(), kycFragment.getKyc4IntField(), kycFragment.getKyc5IntField(), kycFragment.getKyc7IntField(), kycFragment.getKyc8IntField(), kycFragment.getKyc9IntField());
        kycFragment.getKyc3IntField().addValueChangeListener(e -> updateState());
        kycFragment.getKyc4IntField().addValueChangeListener(e -> updateState());
        kycFragment.getKyc5IntField().addValueChangeListener(e -> updateState());
        kycFragment.getKyc7IntField().addValueChangeListener(e -> updateState());
        kycFragment.getKyc8IntField().addValueChangeListener(e -> updateState());
        kycFragment.getKyc9IntField().addValueChangeListener(e -> updateState());

        // Alert details
        viewUtil.setIcon(alertDetails, alertFragment.getalert3IntField(), alertFragment.getalert4IntField(), alertFragment.getalert5IntField(), alertFragment.getalert7IntField(), alertFragment.getalert8IntField(), alertFragment.getalert9IntField());
        alertFragment.getalert3IntField().addValueChangeListener(e -> updateState());
        alertFragment.getalert4IntField().addValueChangeListener(e -> updateState());
        alertFragment.getalert5IntField().addValueChangeListener(e -> updateState());
        alertFragment.getalert7IntField().addValueChangeListener(e -> updateState());
        alertFragment.getalert8IntField().addValueChangeListener(e -> updateState());
        alertFragment.getalert9IntField().addValueChangeListener(e -> updateState());
    }


    public void updateState() {
        // Kyc details
        viewUtil.updateSum(kycFragment.getKyc2IntField(), kycFragment.getKyc3IntField(), kycFragment.getKyc4IntField(), kycFragment.getKyc5IntField());
        viewUtil.updateSum(kycFragment.getKyc6IntField(), kycFragment.getKyc7IntField(), kycFragment.getKyc8IntField(), kycFragment.getKyc9IntField());
        viewUtil.updateSum(kycFragment.getKyc1IntField(), kycFragment.getKyc2IntField(), kycFragment.getKyc6IntField());
        viewUtil.setIcon(kycDetails, kycFragment.getKyc3IntField(), kycFragment.getKyc4IntField(), kycFragment.getKyc5IntField(), kycFragment.getKyc7IntField(), kycFragment.getKyc8IntField(), kycFragment.getKyc9IntField());
        // Alert details
        viewUtil.updateSum(alertFragment.getalert2IntField(), alertFragment.getalert3IntField(), alertFragment.getalert4IntField(), alertFragment.getalert5IntField());
        viewUtil.updateSum(alertFragment.getalert6IntField(), alertFragment.getalert7IntField(), alertFragment.getalert8IntField(), alertFragment.getalert9IntField());
        viewUtil.updateSum(alertFragment.getalert1IntField(), alertFragment.getalert2IntField(), alertFragment.getalert6IntField());
        viewUtil.setIcon(alertDetails, alertFragment.getalert3IntField(), alertFragment.getalert4IntField(), alertFragment.getalert5IntField(), alertFragment.getalert7IntField(), alertFragment.getalert8IntField(), alertFragment.getalert9IntField());

    }


}