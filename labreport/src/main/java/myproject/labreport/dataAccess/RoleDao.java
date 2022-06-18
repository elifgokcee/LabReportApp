package myproject.labreport.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.labreport.entities.role.Role;

public interface RoleDao extends JpaRepository<Role, Integer>{

}
