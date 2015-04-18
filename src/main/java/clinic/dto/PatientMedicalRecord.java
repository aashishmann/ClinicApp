package clinic.dto;

import javax.persistence.*;

/**
 * It will store the medical condition of any individual
 * patient coming to the clinic
 *
 * Created by aashish on 22/11/14.
 */
@Entity
@Table(name = "patient_medical_record")
public class PatientMedicalRecord {
    private int patientId;
    private String chiefComplaints;
    private String mentalSymptoms;
    private String physicalSymptoms;
    private String investigation;
    private String familyHistory;
    private String thermal;
    private String desire;
    private String aversion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Column(name="thermal",length = 1024)
    public String getThermal() {
        return thermal;
    }

    public void setThermal(String thermal) {
        this.thermal = thermal;
    }

    @Column(name = "desire",length = 1024)
    public String getDesire() {
        return desire;
    }

    public void setDesire(String desire) {
        this.desire = desire;
    }

    @Column(name = "aversion",length = 1024)
    public String getAversion() {
        return aversion;
    }

    public void setAversion(String aversion) {
        this.aversion = aversion;
    }

    @Column(name = "chief_complaints",length = 1024)
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints;
    }

    @Column(name="mental_symptoms",length = 1024)
    public String getMentalSymptoms() {
        return mentalSymptoms;
    }

    public void setMentalSymptoms(String mentalSymptoms) {
        this.mentalSymptoms = mentalSymptoms;
    }

    @Column(name="physical_symptoms",length = 1024)
    public String getPhysicalSymptoms() {
        return physicalSymptoms;
    }

    public void setPhysicalSymptoms(String physicalSymptoms) {
        this.physicalSymptoms = physicalSymptoms;
    }

    @Column(name = "investigation",length = 1024)
    public String getInvestigation() {
        return investigation;
    }

    public void setInvestigation(String investigation) {
        this.investigation = investigation;
    }

    @Column(name = "family_history",length = 1024)
    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }
}
