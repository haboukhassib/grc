package com.company.grc.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "AUDIT_RECOMMENDATION", indexes = {
        @Index(name = "IDX_AUDIT_RECOMMENDATION_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class AuditRecommendation {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "AUDITOR_NAME", nullable = false)
    @NotNull
    private String auditorName;
    @Column(name = "AUDIT_DATE", nullable = false)
    @NotNull
    private LocalDate auditDate;
    @NotNull
    @Column(name = "AUDIT_THEME")
    private String auditTheme;
    @Column(name = "AUDIT_REPORT_DATE")
    private LocalDate auditReportDate;
    @Comment("Prononcé de sanctions")
    @Column(name = "AUDIT_SANCTION")
    private String auditSanction;
    @Comment("Nombre total de recommandations")
    @Column(name = "TOTAL_NB_RECO")
    private Integer totalNbReco;
    @Comment("Nombre de recommandations clôturées")
    @Column(name = "TOTAL_NB_RECO_CLOSED")
    private Integer totalNbRecoClosed;
    @Column(name = "ADDITIONAL_COMMENT")
    @Lob
    private String additionalComment;

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

    public void setTotalNbRecoClosed(Integer totalNbRecoClosed) {
        this.totalNbRecoClosed = totalNbRecoClosed;
    }

    public Integer getTotalNbRecoClosed() {
        return totalNbRecoClosed;
    }

    public void setTotalNbReco(Integer totalNbReco) {
        this.totalNbReco = totalNbReco;
    }

    public Integer getTotalNbReco() {
        return totalNbReco;
    }

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public String getAdditionalComment() {
        return additionalComment;
    }

    public void setAdditionalComment(String additionalComment) {
        this.additionalComment = additionalComment;
    }

    public String getAuditSanction() {
        return auditSanction;
    }

    public void setAuditSanction(String auditSanction) {
        this.auditSanction = auditSanction;
    }

    public LocalDate getAuditReportDate() {
        return auditReportDate;
    }

    public void setAuditReportDate(LocalDate auditReportDate) {
        this.auditReportDate = auditReportDate;
    }

    public String getAuditTheme() {
        return auditTheme;
    }

    public void setAuditTheme(String auditTheme) {
        this.auditTheme = auditTheme;
    }

    public LocalDate getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDate auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}