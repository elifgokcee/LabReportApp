package  myproject.labreport.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import  myproject.labreport.business.abstracts.PatientReportService;

import  myproject.labreport.entities.PatientReport;


@CrossOrigin 

@RestController
public class PatientReportsController {
	
private PatientReportService service;

   @Autowired

	public PatientReportsController( PatientReportService service) {
		this.service=service;
	}
   
   
	@GetMapping("/patientreports")
	public ModelAndView getAll(){
		ModelAndView mav=new ModelAndView("get-reports");
		List<PatientReport> list=service.getAll();
		mav.addObject("patientreports", list);
		
		return mav;}
 
		@GetMapping("/patientreports/{id}")
		public ModelAndView getById(@PathVariable (name="id") int id){
			ModelAndView mav=new ModelAndView("get-report-details");
			PatientReport report=service.getById(id);
			mav.addObject("patientreportdetails", report);
			
			return mav;
			}
		@GetMapping("patientreports/addreportform")
		public ModelAndView addReportForm( ) {
			PatientReport report=new PatientReport();
			ModelAndView mav=new ModelAndView("add-report-form");
			mav.addObject("report", report);
		  

		   
		
	
			return mav;
		}
      @PostMapping("patientreports/addreport")
    public String addReport(@ModelAttribute PatientReport report) {
    	
    	service.add(report);
		return "/reports";
    	
      }
    
    
    
}