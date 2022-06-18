package myproject.labreport.business.abstracts;

import myproject.labreport.entities.ReportPicture;

public interface PictureService {
public void add(ReportPicture picture);
public void delete(int pictureId);
public void update(int pictureId);

}
