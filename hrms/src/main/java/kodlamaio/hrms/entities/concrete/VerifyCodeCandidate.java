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
@EqualsAndHashCode(callSuper = true)
@Table(name = "verification_codes_candidates")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerifyCodeCandidate extends VerifyCode {

	@NotNull
	@NotBlank
	@Column(name = "candidate_id")
	private int candidateId;

	public VerifyCodeCandidate(@NotNull @NotBlank String code, @NotNull @NotBlank boolean isVerified, @NotNull @NotBlank int candidateId) {
		super(code, isVerified);
		this.candidateId = candidateId;
	}
	
}
