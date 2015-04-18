package clinic.servlets.helper;

import clinic.dto.PatientMedicalRecord;
import clinic.service.IPatientService;
import clinic.service.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aashish on 7/3/15.
 */
@Controller
@RequestMapping("/service/clinicPlus/")
/*@Path("/service/clinicPlus")*/
public class PatientTempServlet {

    @Autowired
    private IPatientService service;

    private PatientServiceImpl serviceImpl = new PatientServiceImpl();

    @ResponseBody
    @RequestMapping(value = "addMedicalRecord")
    public void addMedRecordImpl(PatientMedicalRecord record) {
        System.out.println("temp controller fake impl");
        serviceImpl.addPatientMedicalRecordImpl(record);
    }

    public void addMedRecord(PatientMedicalRecord record) {
        System.out.println("temp controller");
        service.addPatientMedicalRecord(record);
    }
}
