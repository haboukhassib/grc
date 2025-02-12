package com.company.grc.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "REPORTING", indexes = {
        @Index(name = "IDX_REPORTING_USER", columnList = "USER_ID"),
        @Index(name = "IDX_REPORTING_ORGANIZATION", columnList = "ORGANIZATION_ID")
})
@Entity
public class Reporting {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @JoinColumn(name = "ORGANIZATION_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Organization organization;
    @Column(name = "YEAR_", nullable = false)
    @NotNull
    private Integer year;
    @Column(name = "MONTH_", nullable = false)
    @NotNull
    private Integer month;
    @JoinColumn(name = "USER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;
    @PositiveOrZero
    @Column(name = "ORG1_INT")
    private Integer org1Int;
    @PositiveOrZero
    @Column(name = "ORG2_INT")
    private Integer org2Int;
    @PositiveOrZero
    @Column(name = "ORG3_INT")
    private Integer org3Int;
    @Column(name = "ORG4_TXT")
    @Lob
    private String org4Txt;
    @Comment("Total Headcount EER")
    @PositiveOrZero
    @Column(name = "KYC1_INT")
    private Integer kyc1Int;
    @Comment("Number of EER Natural Person")
    @Column(name = "KYC2_INT")
    private Integer kyc2Int;
    @Comment("High Risk NP")
    @Column(name = "KYC3_INT")
    private Integer kyc3Int;
    @Comment("Medium Risk NP")
    @Column(name = "KYC4_INT")
    private Integer kyc4Int;
    @Comment("Low Risk NP")
    @Column(name = "KYC5_INT")
    private Integer kyc5Int;
    @Comment("Nunber of EER Legal Entities")
    @Column(name = "KYC6_INT")
    private Integer kyc6Int;
    @Comment("High Risk LE")
    @Column(name = "KYC7_INT")
    private Integer kyc7Int;
    @Comment("Medium Risk LE")
    @Column(name = "KYC8_INT")
    private Integer kyc8Int;
    @Comment("Low Risk LE")
    @Column(name = "KYC9_INT")
    private Integer kyc9Int;
    @Comment("Total Alerts Raised")
    @Column(name = "ALERT1_INT")
    private Integer alert1Int;
    @Comment("Total Alerts Natural Person")
    @Column(name = "ALERT2_INT")
    private Integer alert2Int;
    @Comment("High Risk NP")
    @Column(name = "ALERT3_INT")
    private Integer alert3Int;
    @Comment("Medium Risk NP")
    @Column(name = "ALERT4_INT")
    private Integer alert4Int;
    @Comment("Low Risk NP")
    @Column(name = "ALERT5_INT")
    private Integer alert5Int;
    @Comment("Total Alerts Legal Entities")
    @Column(name = "ALERT6_INT")
    private Integer alert6Int;
    @Comment("High Risk LE")
    @Column(name = "ALERT7_INT")
    private Integer alert7Int;
    @Comment("Medium Risk LE")
    @Column(name = "ALERT8_INT")
    private Integer alert8Int;
    @Comment("Low Risk LE")
    @Column(name = "ALERT9_INT")
    private Integer alert9Int;
    @Comment("Nombre d'alertes Siron KYC traitées")
    @Column(name = "FILTRAGE_CLIENT1_INT")
    private Integer filtrageClient1Int;
    @Comment("Nombre d'alertes relatives aux listes de sanctions")
    @Column(name = "FILTRAGE_CLIENT2_INT")
    private Integer filtrageClient2Int;
    @Comment("Nombre d'alertes relatives aux PEP")
    @Column(name = "FILTRAGE_CLIENT3_INT")
    private Integer filtrageClient3Int;
    @Comment("Nombre d'alertes Siron KYC traitées")
    @Column(name = "FILTRAGE_CLIENT4_INT")
    private Integer filtrageClient4Int;
    @Comment("Nombre d'alertes sanctions screening remontées")
    @Column(name = "FILTRAGE_TRAN1_INT")
    private Integer filtrageTran1Int;
    @Comment("Nombre d'alertes sanctions screening traitées")
    @Column(name = "FILTRAGE_TRAN2_INT")
    private Integer filtrageTran2Int;
    @Comment("Nombre total des DOS")
    @Column(name = "CENTIF1_INT")
    private Integer centif1Int;
    @Comment("Nombre total demandes d’information CENTIF")
    @Column(name = "CENTIF2_INT")
    private Integer centif2Int;
    @Comment("Nombre de soupçons internes remontés")
    @Column(name = "CENTIF3_INT")
    private Integer centif3Int;
    @Comment("Nouvelles EER assujettis à FATCA")
    @Column(name = "FATCA1_INT")
    private Integer fatca1Int;
    @Comment("Stock de clients assujettis à FATCA")
    @Column(name = "FATCA2_INT")
    private Integer fatca2Int;
    @Comment("Stock de clients récalcitrants")
    @Column(name = "FATCA3_INT")
    private Integer fatca3Int;
    @Comment("Nombre de traitements éligibles aux déclarations APDP")
    @Column(name = "PDP1_INT")
    private Integer pdp1Int;
    @Comment("Nombre de traitements dossiers déposés à la APDP")
    @Column(name = "PDP2_INT")
    private Integer pdp2Int;
    @Comment("Nombre d'autorisations reçues de la part de la APDP")
    @Column(name = "PDP3_INT")
    private Integer pdp3Int;
    @Comment("Nombre contrôles prévus période")
    @Column(name = "CTRL_CONF1_INT")
    private Integer ctrlConf1Int;
    @Comment("Nombre de contrôles réalisés période")
    @Column(name = "CTRL_CONF2_INT")
    private Integer ctrlConf2Int;
    @Comment("Nombre de dossiers contrôlés période")
    @Column(name = "CTRL_CONF3_INT")
    private Integer ctrlConf3Int;
    @Comment("Nombre de dossiers contrôlés conformes période")
    @Column(name = "CTRL_CONF4_INT")
    private Integer ctrlConf4Int;
    @Comment("Nombre total de recos émises")
    @Column(name = "CTRL_CONF5_INT")
    private Integer ctrlConf5Int;
    @Comment("Nombre de Recos Clôturées")
    @Column(name = "CTRL_CONF6_INT")
    private Integer ctrlConf6Int;
    @Comment("Commentaire Contrôle Conformité")
    @Column(name = "CTRL_CONF7_INT")
    @Lob
    private String ctrlConf7Int;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<AuditRecommendation> auditRecommendation;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<RegulatoryMonitoring> regulatoryMonitoring;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<NewProductActivity> newProductActivity;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<SanctionPenalty> sanctionPenalty;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<IncidentTool> incidentTool;
    @Composition
    @OneToMany(mappedBy = "reporting")
    private List<TrainingAwareness> trainingAwareness;

    public List<AuditRecommendation> getAuditRecommendation() {
        return auditRecommendation;
    }

    public void setAuditRecommendation(List<AuditRecommendation> auditRecommendation) {
        this.auditRecommendation = auditRecommendation;
    }

    public List<IncidentTool> getIncidentTool() {
        return incidentTool;
    }

    public void setIncidentTool(List<IncidentTool> incidentTool) {
        this.incidentTool = incidentTool;
    }

    public List<TrainingAwareness> getTrainingAwareness() {
        return trainingAwareness;
    }

    public void setTrainingAwareness(List<TrainingAwareness> trainingAwareness) {
        this.trainingAwareness = trainingAwareness;
    }

    public List<SanctionPenalty> getSanctionPenalty() {
        return sanctionPenalty;
    }

    public void setSanctionPenalty(List<SanctionPenalty> sanctionPenalty) {
        this.sanctionPenalty = sanctionPenalty;
    }

    public List<NewProductActivity> getNewProductActivity() {
        return newProductActivity;
    }

    public void setNewProductActivity(List<NewProductActivity> newProductActivity) {
        this.newProductActivity = newProductActivity;
    }

    public String getCtrlConf7Int() {
        return ctrlConf7Int;
    }

    public void setCtrlConf7Int(String ctrlConf7Int) {
        this.ctrlConf7Int = ctrlConf7Int;
    }

    public Integer getCtrlConf6Int() {
        return ctrlConf6Int;
    }

    public void setCtrlConf6Int(Integer ctrlConf6Int) {
        this.ctrlConf6Int = ctrlConf6Int;
    }

    public void setCtrlConf5Int(Integer ctrlConf5Int) {
        this.ctrlConf5Int = ctrlConf5Int;
    }

    public Integer getCtrlConf5Int() {
        return ctrlConf5Int;
    }

    public Integer getCtrlConf4Int() {
        return ctrlConf4Int;
    }

    public void setCtrlConf4Int(Integer ctrlConf4Int) {
        this.ctrlConf4Int = ctrlConf4Int;
    }

    public Integer getCtrlConf3Int() {
        return ctrlConf3Int;
    }

    public void setCtrlConf3Int(Integer ctrlConf3Int) {
        this.ctrlConf3Int = ctrlConf3Int;
    }

    public Integer getCtrlConf2Int() {
        return ctrlConf2Int;
    }

    public void setCtrlConf2Int(Integer ctrlConf2Int) {
        this.ctrlConf2Int = ctrlConf2Int;
    }

    public Integer getCtrlConf1Int() {
        return ctrlConf1Int;
    }

    public void setCtrlConf1Int(Integer ctrlConf1Int) {
        this.ctrlConf1Int = ctrlConf1Int;
    }

    public Integer getPdp3Int() {
        return pdp3Int;
    }

    public void setPdp3Int(Integer pdp3Int) {
        this.pdp3Int = pdp3Int;
    }

    public Integer getPdp2Int() {
        return pdp2Int;
    }

    public void setPdp2Int(Integer pdp2Int) {
        this.pdp2Int = pdp2Int;
    }

    public Integer getPdp1Int() {
        return pdp1Int;
    }

    public void setPdp1Int(Integer pdp1Int) {
        this.pdp1Int = pdp1Int;
    }

    public Integer getFatca3Int() {
        return fatca3Int;
    }

    public void setFatca3Int(Integer fatca3Int) {
        this.fatca3Int = fatca3Int;
    }

    public Integer getFatca2Int() {
        return fatca2Int;
    }

    public void setFatca2Int(Integer fatca2Int) {
        this.fatca2Int = fatca2Int;
    }

    public Integer getFatca1Int() {
        return fatca1Int;
    }

    public void setFatca1Int(Integer fatca1Int) {
        this.fatca1Int = fatca1Int;
    }

    public Integer getCentif3Int() {
        return centif3Int;
    }

    public void setCentif3Int(Integer centif3Int) {
        this.centif3Int = centif3Int;
    }

    public Integer getCentif2Int() {
        return centif2Int;
    }

    public void setCentif2Int(Integer centif2Int) {
        this.centif2Int = centif2Int;
    }

    public Integer getCentif1Int() {
        return centif1Int;
    }

    public void setCentif1Int(Integer centif1Int) {
        this.centif1Int = centif1Int;
    }

    public Integer getFiltrageTran2Int() {
        return filtrageTran2Int;
    }

    public void setFiltrageTran2Int(Integer filtrageTran2Int) {
        this.filtrageTran2Int = filtrageTran2Int;
    }

    public Integer getFiltrageTran1Int() {
        return filtrageTran1Int;
    }

    public void setFiltrageTran1Int(Integer filtrageTran1Int) {
        this.filtrageTran1Int = filtrageTran1Int;
    }

    public Integer getFiltrageClient4Int() {
        return filtrageClient4Int;
    }

    public void setFiltrageClient4Int(Integer filtrageClient4Int) {
        this.filtrageClient4Int = filtrageClient4Int;
    }

    public Integer getFiltrageClient3Int() {
        return filtrageClient3Int;
    }

    public void setFiltrageClient3Int(Integer filtrageClient3Int) {
        this.filtrageClient3Int = filtrageClient3Int;
    }

    public Integer getFiltrageClient2Int() {
        return filtrageClient2Int;
    }

    public void setFiltrageClient2Int(Integer filtrageClient2Int) {
        this.filtrageClient2Int = filtrageClient2Int;
    }

    public Integer getFiltrageClient1Int() {
        return filtrageClient1Int;
    }

    public void setFiltrageClient1Int(Integer filtrageClient1Int) {
        this.filtrageClient1Int = filtrageClient1Int;
    }

    public Integer getAlert9Int() {
        return alert9Int;
    }

    public void setAlert9Int(Integer alert9Int) {
        this.alert9Int = alert9Int;
    }

    public Integer getAlert8Int() {
        return alert8Int;
    }

    public void setAlert8Int(Integer alert8Int) {
        this.alert8Int = alert8Int;
    }

    public Integer getAlert7Int() {
        return alert7Int;
    }

    public void setAlert7Int(Integer alert7Int) {
        this.alert7Int = alert7Int;
    }

    public Integer getAlert6Int() {
        return alert6Int;
    }

    public void setAlert6Int(Integer alert6Int) {
        this.alert6Int = alert6Int;
    }

    public Integer getAlert5Int() {
        return alert5Int;
    }

    public void setAlert5Int(Integer alert5Int) {
        this.alert5Int = alert5Int;
    }

    public Integer getAlert4Int() {
        return alert4Int;
    }

    public void setAlert4Int(Integer alert4Int) {
        this.alert4Int = alert4Int;
    }

    public Integer getAlert3Int() {
        return alert3Int;
    }

    public void setAlert3Int(Integer alert3Int) {
        this.alert3Int = alert3Int;
    }

    public Integer getAlert2Int() {
        return alert2Int;
    }

    public void setAlert2Int(Integer alert2Int) {
        this.alert2Int = alert2Int;
    }

    public Integer getAlert1Int() {
        return alert1Int;
    }

    public void setAlert1Int(Integer alert1Int) {
        this.alert1Int = alert1Int;
    }

    public Integer getKyc9Int() {
        return kyc9Int;
    }

    public void setKyc9Int(Integer kyc9Int) {
        this.kyc9Int = kyc9Int;
    }

    public Integer getKyc8Int() {
        return kyc8Int;
    }

    public void setKyc8Int(Integer kyc8Int) {
        this.kyc8Int = kyc8Int;
    }

    public Integer getKyc7Int() {
        return kyc7Int;
    }

    public void setKyc7Int(Integer kyc7Int) {
        this.kyc7Int = kyc7Int;
    }

    public void setKyc6Int(Integer kyc6Int) {
        this.kyc6Int = kyc6Int;
    }

    public Integer getKyc6Int() {
        return kyc6Int;
    }

    public Integer getKyc5Int() {
        return kyc5Int;
    }

    public void setKyc5Int(Integer kyc5Int) {
        this.kyc5Int = kyc5Int;
    }

    public Integer getKyc4Int() {
        return kyc4Int;
    }

    public void setKyc4Int(Integer kyc4Int) {
        this.kyc4Int = kyc4Int;
    }

    public Integer getKyc3Int() {
        return kyc3Int;
    }

    public void setKyc3Int(Integer kyc3Int) {
        this.kyc3Int = kyc3Int;
    }

    public List<RegulatoryMonitoring> getRegulatoryMonitoring() {
        return regulatoryMonitoring;
    }

    public void setRegulatoryMonitoring(List<RegulatoryMonitoring> regulatoryMonitoring) {
        this.regulatoryMonitoring = regulatoryMonitoring;
    }

    public Integer getKyc2Int() {
        return kyc2Int;
    }

    public void setKyc2Int(Integer kyc2Int) {
        this.kyc2Int = kyc2Int;
    }

    public Integer getKyc1Int() {
        return kyc1Int;
    }

    public void setKyc1Int(Integer kyc1Int) {
        this.kyc1Int = kyc1Int;
    }

    public String getOrg4Txt() {
        return org4Txt;
    }

    public void setOrg4Txt(String org4Txt) {
        this.org4Txt = org4Txt;
    }

    public Integer getOrg3Int() {
        return org3Int;
    }

    public void setOrg3Int(Integer org3Int) {
        this.org3Int = org3Int;
    }

    public Integer getOrg2Int() {
        return org2Int;
    }

    public void setOrg2Int(Integer org2Int) {
        this.org2Int = org2Int;
    }

    public Integer getOrg1Int() {
        return org1Int;
    }

    public void setOrg1Int(Integer org1Int) {
        this.org1Int = org1Int;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Month getMonth() {
        return month == null ? null : Month.fromId(month);
    }

    public void setMonth(Month month) {
        this.month = month == null ? null : month.getId();
    }

    public Year getYear() {
        return year == null ? null : Year.fromId(year);
    }

    public void setYear(Year year) {
        this.year = year == null ? null : year.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"year", "month"})
    public String getInstanceName(MetadataTools metadataTools) {
        return String.format("%s %s",
                metadataTools.format(getYear()),
                metadataTools.format(getMonth()));
    }
}