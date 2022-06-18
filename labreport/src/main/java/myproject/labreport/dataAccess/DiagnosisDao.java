package myproject.labreport.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import  myproject.labreport.entities.Diagnosis;

public interface DiagnosisDao extends JpaRepository<Diagnosis, Integer>{




}
