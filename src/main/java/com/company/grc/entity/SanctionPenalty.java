package com.company.grc.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "SANCTION_PENALTY", indexes = {
        @Index(name = "IDX_SANCTION_PENALTY_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class SanctionPenalty {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @NotNull
    @Comment("Object de la Sanction")
    @Column(name = "SANCTION_PURPOSE")
    private String sanctionPurpose;
    @NotNull
    @Comment("Entité ayant réalisé la sanction")
    @Column(name = "SANCTION_ENTITY_CARRIER")
    private String sanctionEntityCarrier;
    @NotNull
    @Comment("Nature et détails de la sanction")
    @Column(name = "SANCTION_DETAILS")
    private String sanctionDetails;

    @Comment("Pièce Jointe")
    @Column(name = "ATTACHMENT", length = 1024)
    private FileRef attachment;

    @JoinColumn(name = "REPORTING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reporting reporting;

    public void setAttachment(FileRef attachment) {
        this.attachment = attachment;
    }

    public FileRef getAttachment() {
        return attachment;
    }

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public String getSanctionDetails() {
        return sanctionDetails;
    }

    public void setSanctionDetails(String sanctionDetails) {
        this.sanctionDetails = sanctionDetails;
    }

    public String getSanctionEntityCarrier() {
        return sanctionEntityCarrier;
    }

    public void setSanctionEntityCarrier(String sanctionEntityCarrier) {
        this.sanctionEntityCarrier = sanctionEntityCarrier;
    }

    public String getSanctionPurpose() {
        return sanctionPurpose;
    }

    public void setSanctionPurpose(String sanctionPurpose) {
        this.sanctionPurpose = sanctionPurpose;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}