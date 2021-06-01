package kodlamaio.hrms.entities.dtos;

import kodlamaio.hrms.core.entities.abstracts.dtos.authDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RegisterEmployerDto extends authDto {

	private String companyName;
	private String phoneNumber;
	private String webAdress;
	private String passwordConfirm;
}
