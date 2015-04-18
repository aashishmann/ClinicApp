package clinic.dao;

import clinic.dto.PatientMedicalRecord;

/**
 * Created by aashish on 25/2/15.
 */
public interface IPatientDao {
    public void addPatientMedicalRecord(PatientMedicalRecord medicalRecord);
}
