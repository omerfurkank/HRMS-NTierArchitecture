package kodlamaio.hrms.entities.concrete;

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
@Table(name="employees")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Employee extends User{
	
	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	
}
