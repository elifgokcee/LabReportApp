package myproject.labreport.business.abstracts;

import java.util.Date;
import java.util.List;


import myproject.labreport.entities.PatientReport;

public interface PatientReportService {
	public void add(PatientReport report);

public void deleteById(int reportId);
public PatientReport getById(int reportId);

public List<PatientReport> getAll();
public List<PatientReport> getByDateOfIssue(Date issuedate);
public List<PatientReport> getByPatient_PatientNameOrPatient_SurName(String info);
public List<PatientReport> getByPatient_NationalityId(String nationalityId);
public List<PatientReport> getByLaborant_LaborantNameOrLaborant_LaborantSurName(String info);
public void update(int reportId);



}
