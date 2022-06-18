package myproject.labreport.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import myproject.labreport.business.abstracts.PatientService;
import myproject.labreport.entities.Patient;

@CrossOrigin 
@RequestMapping("/patients")
@RestController
public class PatientController {
	private PatientService service;
	 @Autowired
	public PatientController(PatientService service) {
		this.service=service;
	}
	
	
	@GetMapping({"/",""})
	
	public ModelAndView getAll(){
		ModelAndView mav=new ModelAndView("get-patients");
		List<Patient> list=service.getAll();
		mav.addObject("patients", list);
		
		return mav;
		}
	
	
	@GetMapping("/patientdetail/{id}")
	
	public ModelAndView getById(@PathVariable(name="id") int id){
		ModelAndView mav=new ModelAndView("patient-detail");
		Patient pt=service.getById(id);
		mav.addObject("patient", pt);
		
		return mav;
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
