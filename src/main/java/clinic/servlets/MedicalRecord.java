package clinic.servlets;

import clinic.dto.PatientMedicalRecord;
import clinic.service.IPatientService;
import clinic.servlets.helper.PatientTempServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;


/**
 * Created by aashish on 5/1/15.
 */
@WebServlet("/addMedicalRecord")
public class MedicalRecord extends HttpServlet{
    private static final long serialVersionUID = 12L;

    @Autowired
    private IPatientService patientService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        PatientMedicalRecord record = new PatientMedicalRecord();
//        PatientServiceImpl service = new PatientServiceImpl();
        record.setAversion("Aversion");
        record.setDesire("desire");
        System.out.println("desire :" + record.getDesire());
        System.out.println("thermal :" + record.getThermal());
 /*       if(service != null) {
            System.out.println("Service");
            if(record != null) {
                System.out.println("record");
                service.addPatientMedicalRecord(record);
            }
        }
 */
        /*PatientTempServlet servlet = new PatientTempServlet();
        servlet.addMedRecordImpl(record);
        System.out.println("Temp Servlet Done");
*/
        if(patientService != null) {
            System.out.println("patientService");
            System.out.println("record");
            patientService.addPatientMedicalRecord(record);
            System.out.println("SUCCESSFULL");
        }
        else{
            System.out.println("Autowiring failed");
        }
        System.out.println("END");
    }
}