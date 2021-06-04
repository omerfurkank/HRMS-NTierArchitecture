package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

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
	private LocalDate birthDate;
	private String passwordConfirm;
	
}
