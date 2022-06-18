package myproject.labreport.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import myproject.labreport.business.abstracts.LaborantService;
import myproject.labreport.config.business.SecurityService;
import myproject.labreport.dataAccess.LaborantDao;
import myproject.labreport.entities.Laborant;
import myproject.labreport.entities.Patient;
import myproject.labreport.entities.dtos.LaborantRegisterDto;
@CrossOrigin

@Controller
public class LoginController {
	   @Autowired
	    private LaborantService userService;

	    @Autowired
	    private SecurityService securityService;
	@GetMapping("/login")
	 public String login(Model model, String error, String logout) {
		
        if (securityService.isAuthenticated()) {
        
        	return "login";
        }

        else if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        else if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

      
    	return "error";
    }
			
	
	  
	 @GetMapping({"/"})
	    public String welcome(Model model) {
	        return "patients";
	    }
	  
}