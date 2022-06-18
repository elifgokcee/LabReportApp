package myproject.labreport.config.business;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import myproject.labreport.dataAccess.LaborantDao;
import myproject.labreport.entities.Laborant;
import myproject.labreport.entities.role.Role;

import java.util.Set;

@Service
	public class UserDetailsServiceImpl implements UserDetailsService{
	    
	    private  LaborantDao userRepository;
	    @Autowired
	   public UserDetailsServiceImpl(LaborantDao userRepository) {
		   this.userRepository=userRepository;
	   }
	    @Override
	    @Transactional(readOnly = true)
	    public UserDetails loadUserByUsername(String email) {
	       Laborant user = userRepository.findByEmail("gokceeliif@gmail.com");
	      
	     
	        
	        if (user == null )  
	        	{
	        	throw new UsernameNotFoundException(email);}
	       
	     
		   
	        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
	        for (Role role : user.getRoles()){
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	        
	        }
	       
	    
	        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
	    }
}
