package myproject.labreport.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

import lombok.NoArgsConstructor;
import myproject.labreport.entities.role.Role;
@Data
@Table(name="laborants")
@Entity
@NoArgsConstructor

public class Laborant {
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		@Column(name="laborant_id")

		private int laborantId;

		@NotNull
		@Column(name="email",unique = true)
		private String email;
		
		@NotNull
		@Column(name="password")
		private String password;
	

	@NotNull
	@Column(name="hospital_identity_id",unique = true)
	private int hospitalIdentityId;
	@NotNull
	@Column(name="laborant_name")
	private String laborantName;
	@NotNull
	@Column(name="laborant_sur_name")
	private String laborantSurName;
	@OneToMany(mappedBy = "laborant")
	private List<PatientReport> report;
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="laborant_id",referencedColumnName = "id")
	
	private List<Role> roles;
	
public Laborant(String email,String password,int hospitalIdentityId,String laborantName,String laborantsurName,List <Role> roles) {
 this.email=email;
 this.password=password;
	this.roles= roles;
	this.hospitalIdentityId=hospitalIdentityId;
	this.laborantName=laborantName;
	this.laborantSurName=laborantsurName;

}



}
