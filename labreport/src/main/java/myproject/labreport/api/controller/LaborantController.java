package myproject.labreport.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import myproject.labreport.business.abstracts.LaborantService;
import myproject.labreport.entities.dtos.LaborantRegisterDto;
@CrossOrigin
@Controller
@RequestMapping("/register")
public class LaborantController {
	private LaborantService service;
	@Autowired
	public LaborantController(LaborantService service) {
	this.service=service;

}
	@ModelAttribute("laborant")
	public LaborantRegisterDto laborantRegisterDto() {
		return new LaborantRegisterDto();
	}
	@PostMapping
	public String registerLaborantAccount(@ModelAttribute("laborant") LaborantRegisterDto dto){
		try {
			service.add(dto);
			return "redirect:/register?success";
		} catch (Exception e) {
		
			return "redirect:/register?error";		}
	
		
	
	}
	@GetMapping("")
	public String showRegisterForm(Model model){
		model.addAttribute("laborant", new LaborantRegisterDto());
		return "register";
		
	
	}
	
}