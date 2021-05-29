package kodlamaio.hrms.entities.concrete.dtos;

import java.util.Date;

import kodlamaio.hrms.core.entities.abstracts.dtos.authDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RegisterCandidateDto extends authDto {

	private String firstName;
	private String lastName;
	private String identityNumber;
	private Date birthDate;
	private String passwordConfirm;
	
}
