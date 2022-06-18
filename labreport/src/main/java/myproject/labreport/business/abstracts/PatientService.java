package myproject.labreport.business.abstracts;

import java.util.List;

import myproject.labreport.entities.Patient;
import myproject.labreport.entities.PatientReport;

public interface PatientService{
	 List<Patient> getAll();
	public void add(Patient patient);
	public void delete(int patientId);
	public Patient getById(int id);
	public List<PatientReport> getReportsById(int patientId);
	
}
