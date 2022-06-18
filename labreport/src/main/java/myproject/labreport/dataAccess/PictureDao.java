package myproject.labreport.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import  myproject.labreport.entities.ReportPicture;

public interface PictureDao extends JpaRepository<ReportPicture, Integer>{

}
