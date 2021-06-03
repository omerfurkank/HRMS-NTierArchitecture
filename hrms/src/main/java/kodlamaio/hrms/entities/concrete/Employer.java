package kodlamaio.hrms.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
public class Employer extends User {
	
	@NotNull
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@NotBlank
	@Column(name="web_adress")
	private String webAdress;
	
	@NotNull
	@NotBlank
	@Column(name="phone_number")
	private String phoneNumber;

	@OneToMany(mappedBy = "employer")
    private List<JobPosting> jobPostings;
}
