package  myproject.labreport.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  myproject.labreport.business.abstracts.PatientReportService;
import  myproject.labreport.dataAccess.PatientReportDao;
import  myproject.labreport.entities.PatientReport;
@Service

public class PatientReportManager implements PatientReportService {
	private final PatientReportDao dao;
	@Autowired
public PatientReportManager(PatientReportDao dao) {
	
		this.dao = dao;
	}

   @Override
   public void add(PatientReport report) {

	dao.save(report);
	
   }

	@Override
	public void deleteById(int reportId) {
		dao.delete(dao.getById(reportId));
		
	}

	@Override
	public PatientReport getById(int reportId) {
		
		return dao.getById(reportId);
	}

	@Override
	public List<PatientReport> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<PatientReport> getByDateOfIssue(Date issuedate) {
		
		return dao.getByDateOfIssue(issuedate);
	}

	@Override
	public List<PatientReport> getByPatient_PatientNameOrPatient_SurName(String info) {
		
		return dao.getByPatient_PatientNameOrPatient_PatientSurName(info, info);
	}

	@Override
	public List<PatientReport> getByPatient_NationalityId(String nationalityId) {
		
		return dao.getByPatient_NationalityId(nationalityId);
	}

	@Override
	public List<PatientReport> getByLaborant_LaborantNameOrLaborant_LaborantSurName(String info) {
		
		return dao.getByLaborant_LaborantNameOrLaborant_LaborantSurName(info, info);
	}

	@Override
	public void update(int reportId) {
		
		PatientReport report=dao.getById(reportId);
		dao.save(report);
	}

}
