package kodlamaio.hrms.entities.concrete;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.core.entities.abstracts.VerifyCode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "verification_codes_candidates")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerifyCodeCandidate extends VerifyCode {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candidate_id", referencedColumnName = "id")
	private Candidate candidate;
}
