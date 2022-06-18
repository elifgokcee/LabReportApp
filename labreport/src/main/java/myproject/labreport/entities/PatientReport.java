package myproject.labreport.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "patient_reports")
@AllArgsConstructor
@NoArgsConstructor

public class PatientReport {
	@Id
	@Column(name = "report_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int reportId;
	
	@NotNull
	@Column(name = "date_issue")
	private 	LocalDateTime dateOfIssue;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laborant_id")
	private Laborant laborant;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@OneToMany(mappedBy="report")
	private List<Diagnosis> diagnosis;
	
	@OneToOne(mappedBy = "report")
	private ReportPicture picture;
	
	public String setDateOfIssue(){
		
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm");
    return (df.format(this.dateOfIssue));
     
	
	}
	
	
	
	

}
