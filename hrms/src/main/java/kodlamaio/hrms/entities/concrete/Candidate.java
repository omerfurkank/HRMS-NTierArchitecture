package kodlamaio.hrms.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import kodlamaio.hrms.core.entities.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
public class Candidate extends User {

	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@NotBlank
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotNull
	@NotBlank
	@Column(name="birth_date")
	private LocalDate birhDate;
}
