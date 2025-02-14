package com.company.grc.view.reporting;

import com.company.grc.app.ViewUtil;
import com.company.grc.entity.Reporting;
import com.company.grc.entity.User;
import com.company.grc.view.alertfragment.AlertFragment;
import com.company.grc.view.centiffragment.CentifFragment;
import com.company.grc.view.ctrlconffragment.CtrlconfFragment;
import com.company.grc.view.fatcafragment.FatcaFragment;
import com.company.grc.view.filtragefragment.FiltrageFragment;
import com.company.grc.view.kycfragment.KycFragment;
import com.company.grc.view.main.MainView;
import com.company.grc.view.organizationfragment.OrganizationFragment;
import com.company.grc.view.pdpfragment.PdpFragment;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.model.DataLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

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

    @ViewComponent
    private OrganizationFragment organizationFragment;
    @ViewComponent
    private Details organizationDetail;

    @ViewComponent
    private FiltrageFragment filtrageFragment;
    @ViewComponent
    private Details filtrageDetails;

    @ViewComponent
    private CentifFragment centifFragment;
    @ViewComponent
    private Details centifDetails;

    @ViewComponent
    private FatcaFragment fatcaFragment;
    @ViewComponent
    private Details fatcaDetails;

    @ViewComponent
    private PdpFragment pdpFragment;
    @ViewComponent
    private Details pdpDetails;

    @ViewComponent
    private CtrlconfFragment ctrlconfFragment;
    @ViewComponent
    private Details ctrlconfDetails;

    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Reporting> event) {
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setUser(user);
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Load organization list with items related to the current user
        String currentUsername = currentAuthentication.getUser().getUsername();
        organizationDl.setParameter("current_user", currentUsername);
        organizationDl.load();

        // Set details indicators for missing values
        kycFragment.setDetailsIndicator(kycDetails);
        alertFragment.setDetailsIndicator(alertDetails);
        organizationFragment.setDetailsIndicator(organizationDetail);
        filtrageFragment.setDetailsIndicator(filtrageDetails);
        centifFragment.setDetailsIndicator(centifDetails);
        fatcaFragment.setDetailsIndicator(fatcaDetails);
        pdpFragment.setDetailsIndicator(pdpDetails);
        ctrlconfFragment.setDetailsIndicator(ctrlconfDetails);

    }

}