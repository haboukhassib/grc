package com.company.grc.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "TRAINING_AWARENESS", indexes = {
        @Index(name = "IDX_TRAINING_AWARENESS_REPORTING", columnList = "REPORTING_ID")
})
@Entity
public class TrainingAwareness {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Comment("Thématique de la formation")
    @Column(name = "TRAINING_THEME")
    private String trainingTheme;
    @Comment("Population cible de la formation")
    @Column(name = "TRAINING_TARGET_POPULATION")
    private String trainingTargetPopulation;
    @Column(name = "TRAINING_DATE")
    private LocalDate trainingDate;
    @Comment("Nombre de participants à la formation")
    @Column(name = "TRAINING_NBR_PARTICIPANTS")
    private String trainingNbrParticipants;
    @Comment("Commentaire Formation")
    @Column(name = "TRAINING_COMMENT")
    @Lob
    private String trainingComment;
    @JoinColumn(name = "REPORTING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reporting reporting;

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public String getTrainingComment() {
        return trainingComment;
    }

    public void setTrainingComment(String trainingComment) {
        this.trainingComment = trainingComment;
    }

    public String getTrainingNbrParticipants() {
        return trainingNbrParticipants;
    }

    public void setTrainingNbrParticipants(String trainingNbrParticipants) {
        this.trainingNbrParticipants = trainingNbrParticipants;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getTrainingTargetPopulation() {
        return trainingTargetPopulation;
    }

    public void setTrainingTargetPopulation(String trainingTargetPopulation) {
        this.trainingTargetPopulation = trainingTargetPopulation;
    }

    public String getTrainingTheme() {
        return trainingTheme;
    }

    public void setTrainingTheme(String trainingTheme) {
        this.trainingTheme = trainingTheme;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}