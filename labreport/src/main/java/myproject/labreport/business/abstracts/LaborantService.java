package myproject.labreport.business.abstracts;




import java.util.Optional;

import myproject.labreport.entities.Laborant;
import myproject.labreport.entities.dtos.LaborantRegisterDto;

public interface LaborantService  {
public void add(LaborantRegisterDto laborantdto);
public void delete(int laborantId);
public void update(int laborantId);
public Laborant findByEmail(String email);

}
