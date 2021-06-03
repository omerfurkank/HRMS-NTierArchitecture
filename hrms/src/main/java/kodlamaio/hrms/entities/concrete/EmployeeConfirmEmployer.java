package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import kodlamaio.hrms.core.entities.abstracts.EmployeeConfirm;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "employee_confirms_employers")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class EmployeeConfirmEmployer extends EmployeeConfirm {

	@NotNull
	@NotBlank
	@Column(name="employee_confirms_employers")
	private int employeeId;
}
