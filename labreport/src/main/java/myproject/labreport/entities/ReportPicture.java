package myproject.labreport.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="report_pictures")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ReportPicture {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@NotNull
@Column(name="picture_id")
private int pictureId;

@NotNull
@Column(name="picture_path")
private String picturePath;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="report_id")
private PatientReport report;

}
