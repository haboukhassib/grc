package com.company.grc.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "REGULATORY_MONITORING", indexes = {
        @Index(name = "IDX_REGULATORY_MONITORING_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class RegulatoryMonitoring {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Comment("Intitulé du texte relatif aux sujets conformité")
    @Column(name = "LEGAL_TEXT_NAME", nullable = false)
    @NotNull
    private String legalTextName;
    @Comment("Objet du texte")
    @Column(name = "TEXT_SUBJECT")
    private String textSubject;
    @Comment("Date d'effet")
    @Column(name = "EFFECTIVE_DATE")
    private LocalDate effectiveDate;
    @JoinColumn(name = "REPORTING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reporting reporting;

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getTextSubject() {
        return textSubject;
    }

    public void setTextSubject(String textSubject) {
        this.textSubject = textSubject;
    }

    public String getLegalTextName() {
        return legalTextName;
    }

    public void setLegalTextName(String legalTextName) {
        this.legalTextName = legalTextName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}