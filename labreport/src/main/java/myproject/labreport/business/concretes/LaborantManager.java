package  myproject.labreport.business.concretes;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import  myproject.labreport.business.abstracts.LaborantService;
import  myproject.labreport.dataAccess.LaborantDao;
import  myproject.labreport.entities.Laborant;
import myproject.labreport.entities.dtos.LaborantRegisterDto;
import myproject.labreport.entities.role.Role;
@Service
public class LaborantManager implements LaborantService  {
     private   LaborantDao dao;
     
     private PasswordEncoder passwordEncoder;
     @Autowired
     public LaborantManager(LaborantDao dao, PasswordEncoder passwordEncoder) {
    	 this.passwordEncoder=passwordEncoder;
    	this.dao=dao;
     }

	@Override
	public void add(LaborantRegisterDto laborantDto) {
		String password=passwordEncoder.encode(laborantDto.getPassword());
		
		Laborant laborant=new Laborant();
		laborant.setPassword(password);
		
		laborant.setEmail(laborantDto.getEmail());
		laborant.setHospitalIdentityId(laborantDto.getHospitalIdentityId());
		laborant.setLaborantName(laborantDto.getLaborantName());
		laborant.setLaborantSurName(laborantDto.getLaborantSurName());
		laborant.setRoles( Arrays.asList(new Role("USER")));

		dao.save(laborant);
		
	}

	@Override
	public void delete(int laborantId) {
		dao.delete(dao.getById(laborantId));
		
	}

	@Override
	public void update(int laborantId) {
		Laborant laborant=dao.getById(laborantId);
		dao.save(laborant);
		
	}
	@Override
	public Laborant findByEmail(String email) {
		return dao.findByEmail(email);
	}

}