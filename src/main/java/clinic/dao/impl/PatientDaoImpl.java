package clinic.dao.impl;

import clinic.dto.PatientMedicalRecord;
import clinic.dao.IPatientDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by aashish on 25/2/15.
 */
@Repository("patientDao")
public class PatientDaoImpl implements IPatientDao {

    //private static final Logger log = org.slf4j.LoggerFactory.getLogger(PatientDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPatientMedicalRecord(PatientMedicalRecord medicalRecord) {
        sessionFactory.getCurrentSession().saveOrUpdate(medicalRecord);
    }

    public void addPatientMedicalRecordImpl(PatientMedicalRecord medicalRecord) {
        System.out.println("Inside DAO Impl");
        sessionFactory.getCurrentSession().saveOrUpdate(medicalRecord);
    }

}
