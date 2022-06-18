package myproject.labreport.business.abstracts;

import java.util.List;

import myproject.labreport.entities.Diagnosis;

public interface DiagnosisService {
public void add(Diagnosis diagnosis);
public void delete(int diagnosisId);
public List<Diagnosis> getAll();
public void update(int diagnosisId);
}
