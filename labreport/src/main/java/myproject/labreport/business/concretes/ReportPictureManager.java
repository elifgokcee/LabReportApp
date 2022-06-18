package  myproject.labreport.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  myproject.labreport.business.abstracts.PictureService;
import  myproject.labreport.dataAccess.PictureDao;
import  myproject.labreport.entities.ReportPicture;
@Service
public class ReportPictureManager implements PictureService {
    private final PictureDao dao;
    @Autowired
    public ReportPictureManager( PictureDao dao) {
    	this.dao=dao;
    }
	@Override
	public void add(ReportPicture picture) {
		dao.save(picture);
	}

	@Override
	public void delete(int pictureId) {
		dao.delete(dao.getById(pictureId));
	}

	@Override
	public void update(int pictureId) {
	ReportPicture picture=dao.getById(pictureId);
	dao.save(picture);
	
		
	}

}
