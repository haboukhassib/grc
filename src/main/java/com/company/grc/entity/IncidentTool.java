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
@Table(name = "INCIDENT_TOOL", indexes = {
        @Index(name = "IDX_INCIDENT_TOOL_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class IncidentTool {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @NotNull
    @Column(name = "TOOL_NAME")
    private String toolName;
    @Comment("Descritption de l'Incident")
    @Column(name = "INCIDENT_DESC")
    private String incidentDesc;
    @Comment("Date de l'Incident")
    @Column(name = "INCIDENT_DATE")
    private LocalDate incidentDate;
    @Comment("Status de l'Incident")
    @Column(name = "INCIDENT_STATUS")
    private String incidentStatus;
    @Column(name = "INCIDENT_COMMENT")
    @Lob
    private String incidentComment;

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

    public String getIncidentComment() {
        return incidentComment;
    }

    public void setIncidentComment(String incidentComment) {
        this.incidentComment = incidentComment;
    }

    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    public LocalDate getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDate incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getIncidentDesc() {
        return incidentDesc;
    }

    public void setIncidentDesc(String incidentDesc) {
        this.incidentDesc = incidentDesc;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}