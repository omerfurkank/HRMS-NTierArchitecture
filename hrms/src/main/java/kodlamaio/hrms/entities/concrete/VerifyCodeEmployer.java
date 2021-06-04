package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import kodlamaio.hrms.core.entities.abstracts.VerifyCode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "verification_codes_employers")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerifyCodeEmployer extends VerifyCode {

	@NotNull
	@NotBlank
	@Column(name = "employer_id")
	private int employerId;

	public VerifyCodeEmployer(@NotNull @NotBlank String code, @NotNull @NotBlank boolean isVerified, @NotNull @NotBlank int employerId) {
		super(code, isVerified);
		this.employerId = employerId;
	}
}
