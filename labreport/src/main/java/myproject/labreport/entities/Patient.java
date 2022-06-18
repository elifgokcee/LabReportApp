package myproject.labreport.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "patients")
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	@NotNull
	private int patientId;
	
	@NotNull
	@Column(name = "nationality_id", unique = true)
	private String nationalityId;
	
	@NotNull
	@Column(name = "patient_name")
    private String patientName;
	
	@NotNull
	@Column(name = "patient_sur_name")
	private String patientSurName;


	@OneToMany(mappedBy="patient")
	private List<PatientReport> report;
	
}
