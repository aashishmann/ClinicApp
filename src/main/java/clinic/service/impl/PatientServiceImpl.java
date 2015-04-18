package clinic.service.impl;

import clinic.dao.IPatientDao;
import clinic.dao.impl.PatientDaoImpl;
import clinic.dto.PatientMedicalRecord;
import clinic.service.IPatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aashish on 25/2/15.
 */

@Transactional
@Service("patientService")
public class PatientServiceImpl implements IPatientService {
//    private static final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    private IPatientDao patientDao;


    @Override
    public void addPatientMedicalRecord(PatientMedicalRecord medicalRecord) {
        System.out.println("PatientServiceImpl: calling DAO");
        patientDao.addPatientMedicalRecord(medicalRecord);
    }

    public void addPatientMedicalRecordImpl(PatientMedicalRecord medicalRecord) {
        System.out.println("Patient fake  Impl: calling DAO Impl");
        PatientDaoImpl daoImpl = new PatientDaoImpl();
        daoImpl.addPatientMedicalRecordImpl(medicalRecord);
    }
}
