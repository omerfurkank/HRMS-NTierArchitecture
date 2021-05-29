package kodlamaio.hrms.core.entities.abstracts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class authDto {

	private String email;
	
	private String password;
}
