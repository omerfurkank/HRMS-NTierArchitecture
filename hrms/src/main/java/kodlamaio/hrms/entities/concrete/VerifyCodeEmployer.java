package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "verification_codes_employers")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerifyCodeEmployer extends VerifyCode {

	@Column(name = "employer_id")
	private int employerId;
}
