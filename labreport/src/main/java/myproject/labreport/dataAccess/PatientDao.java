package myproject.labreport.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import  myproject.labreport.entities.Patient;
import myproject.labreport.entities.PatientReport;

public interface PatientDao extends JpaRepository<Patient, Integer> {
List<PatientReport> getReportByPatientId(int patientId);
}
