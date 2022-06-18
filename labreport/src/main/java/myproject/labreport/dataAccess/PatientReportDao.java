package myproject.labreport.dataAccess;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import  myproject.labreport.entities.PatientReport;

public interface PatientReportDao extends JpaRepository<PatientReport, Integer> {
	
List<PatientReport> getByPatient_PatientNameOrPatient_PatientSurName(String patientName,String patientsurName);

List<PatientReport> getByDateOfIssue(Date date);
List<PatientReport> getByPatient_NationalityId(String nationalityId);
List<PatientReport> getByLaborant_LaborantNameOrLaborant_LaborantSurName(String laborantName,String laborantsurName);

}
