package com.company.grc.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "NEW_PRODUCT_ACTIVITY", indexes = {
        @Index(name = "IDX_NEW_PRODUCT_ACTIVITY_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class NewProductActivity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Comment("Libellé Produit-Activité")
    @Column(name = "PRODUCT_ACTIVITY_NAME")
    private String productActivityName;
    @Comment("Description Produit-Activité")
    @Column(name = "PRODUCT_ACTIVITY_DESC")
    private String productActivityDesc;
    @Comment("Soumis à la validation Compliance")
    @Column(name = "VALIDATION_COMPLIANCE_SUBMITTED")
    private Boolean validationComplianceSubmitted;
    @Comment("Validation compliance effectuée")
    @Column(name = "VALIDATION_COMPLIANCE_DONE")
    private Boolean validationComplianceDone;
    @Comment("Commentaire nouveau produit-activité")
    @Column(name = "NEW_PRODUCT_ACTIVITY_COMMENT")
    @Lob
    private String newProductActivityComment;
    @JoinColumn(name = "REPORTING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reporting reporting;

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public String getNewProductActivityComment() {
        return newProductActivityComment;
    }

    public void setNewProductActivityComment(String newProductActivityComment) {
        this.newProductActivityComment = newProductActivityComment;
    }

    public Boolean getValidationComplianceDone() {
        return validationComplianceDone;
    }

    public void setValidationComplianceDone(Boolean validationCompliance) {
        this.validationComplianceDone = validationCompliance;
    }

    public Boolean getValidationComplianceSubmitted() {
        return validationComplianceSubmitted;
    }

    public void setValidationComplianceSubmitted(Boolean validationCompliance) {
        this.validationComplianceSubmitted = validationCompliance;
    }

    public String getProductActivityDesc() {
        return productActivityDesc;
    }

    public void setProductActivityDesc(String productActivityDesc) {
        this.productActivityDesc = productActivityDesc;
    }

    public String getProductActivityName() {
        return productActivityName;
    }

    public void setProductActivityName(String productActivityName) {
        this.productActivityName = productActivityName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}