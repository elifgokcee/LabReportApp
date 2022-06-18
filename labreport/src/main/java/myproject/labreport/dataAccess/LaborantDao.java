package myproject.labreport.dataAccess;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import myproject.labreport.entities.Laborant;
@Repository
public interface LaborantDao extends JpaRepository<Laborant, Integer> {
	
	@Query("FROM Laborant WHERE email=:email")

Laborant findByEmail(@RequestParam String email);
}
