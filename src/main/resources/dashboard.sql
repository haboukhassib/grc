CREATE OR REPLACE VIEW dashboard AS
WITH  sanction_penalty_summary AS (
    select r.year_ as year, r.quarter, o.name as entity, count(*) as total_sanction_penalty
    from sanction_penalty a
             join reporting r on r.id = a.reporting_id
             join organization o on o.id = r.organization_id
    group by r.year_, r.quarter, o.name
),
      audit_recommendation_summary AS (
          SELECT r.year_ AS year,
                 r.quarter,
                 o.name AS entity,
                 COUNT(*) AS total_audit_recommendations,
                 SUM(total_nb_reco) AS total_nb_reco,
                 SUM(total_nb_reco_closed) AS total_nb_reco_closed
          FROM audit_recommendation a
                   JOIN reporting r ON r.id = a.reporting_id
                   JOIN organization o ON o.id = r.organization_id
          GROUP BY r.year_, r.quarter, o.name
      ),
      regulatory_monitoring_summary AS (
          SELECT r.year_ AS year,
                 r.quarter,
                 o.name AS entity,
                 COUNT(*) AS total_regulatory_texts
          FROM regulatory_monitoring a
                   JOIN reporting r ON r.id = a.reporting_id
                   JOIN organization o ON o.id = r.organization_id
          GROUP BY r.year_, r.quarter, o.name
      )
SELECT r.year_ AS year,
       r.quarter,
       o.name AS entity,
       r.org1_int AS eff_conf,
       r.org3_int AS eff_tot,
       r.centif1_int AS nb_dos_remontees,
       r.kyc3_int AS high_risk_pp,
       r.kyc7_int AS high_risk_pm,
       r.kyc1_int AS tot_eer,
       r.filtrage_client1_int AS nb_alerts_raised,
       r.filtrage_client4_int AS nb_alerts_processed,
       r.filtrage_tran1_int AS nb_alerts_screening_raised,
       r.filtrage_tran2_int AS nb_alerts_screening_processed,
       r.alert2_int AS nb_alerts_siron_raised,
       r.alert6_int AS nb_alerts_siron_processed,
       r.pdp1_int AS nb_eligible_apdp,
       r.pdp3_int AS nb_autorisation_recue_apdp,
       r.centif2_int AS nb_demandes_centif,
       COALESCE(ars.total_audit_recommendations, 0) AS total_audit_recommendations,
       COALESCE(rms.total_regulatory_texts, 0) AS total_regulatory_texts,
       COALESCE(ars.total_nb_reco, 0) AS total_nb_reco,
       COALESCE(ars.total_nb_reco_closed, 0) AS total_nb_reco_closed,
       r.centif1_int AS tot_DOS,
       COALESCE(sps.total_sanction_penalty, 0) AS total_sanction_penalty
FROM reporting r
         JOIN organization o ON r.organization_id = o.id
         LEFT JOIN audit_recommendation_summary ars
                   ON r.year_ = ars.year AND r.quarter = ars.quarter AND o.name = ars.entity
         LEFT JOIN regulatory_monitoring_summary rms
                   ON r.year_ = rms.year AND r.quarter = rms.quarter AND o.name = rms.entity
         LEFT JOIN sanction_penalty_summary sps
                   ON r.year_ = sps.year AND r.quarter = sps.quarter AND o.name = sps.entity;