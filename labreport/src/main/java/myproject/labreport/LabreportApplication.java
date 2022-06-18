package myproject.labreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import myproject.labreport.dataAccess.LaborantDao;






@SpringBootApplication
@ComponentScan(basePackages ="myproject.labreport")
@Configuration
@EnableJpaRepositories(basePackageClasses = LaborantDao.class)
@EnableAutoConfiguration


public class LabreportApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LabreportApplication.class, args);
		
		
		
		
		
		
		
		
		
	}

	

  
}
