package  myproject.labreport.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  myproject.labreport.business.abstracts.PatientService;
import  myproject.labreport.dataAccess.PatientDao;
import  myproject.labreport.entities.Patient;
import myproject.labreport.entities.PatientReport;

@Service
public class PatientManager implements PatientService {
     private final PatientDao dao;
     @Autowired
     public PatientManager(PatientDao dao) {
    	 this.dao=dao;
     }
	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public void add(Patient patient) {
		dao.save(patient);
		
	}
	@Override
	public void delete(int patientId) {
		dao.delete(dao.getById(patientId));
		
	}
	@Override
	public Patient getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public List<PatientReport> getReportsById(int patientId) {
	return	dao.getReportByPatientId(patientId);
	
	}
	
	

}
