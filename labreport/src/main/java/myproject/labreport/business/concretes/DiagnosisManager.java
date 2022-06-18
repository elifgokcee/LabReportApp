package myproject.labreport.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.labreport.business.abstracts.DiagnosisService;
import  myproject.labreport.dataAccess.DiagnosisDao;
import  myproject.labreport.entities.Diagnosis;
@Service
public class DiagnosisManager implements DiagnosisService{
    private final DiagnosisDao dao;
    @Autowired
    public DiagnosisManager(DiagnosisDao dao) {
    	this.dao=dao;
    }
    
	@Override
	public void add(Diagnosis diagnosis) {
		dao.save(diagnosis);
		
	}

	@Override
	public void delete(int diagnosisId) {
		dao.delete(dao.getById(diagnosisId));
		
	}

	@Override
	public List<Diagnosis> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void update(int diagnosisId) {
		Diagnosis diagnosis=dao.getById(diagnosisId);
		dao.save(diagnosis);
		
	}

}
