package myproject.labreport.entities.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LaborantRegisterDto {
	public LaborantRegisterDto(int hospitalIdentityId, String email,	 String laborantsurName, String laborantName) {
		super();
		this.hospitalIdentityId = hospitalIdentityId;
		
		this.email = email;
		this.laborantName=laborantName;
		this.laborantSurName=laborantsurName;
	}
	private int hospitalIdentityId;
	private String password;
	private String email;
	private String laborantSurName;
	private String laborantName;
	
}
