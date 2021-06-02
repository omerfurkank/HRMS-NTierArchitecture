package kodlamaio.hrms.entities.concrete;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_postings")
public class JobPosting {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "job_description")
	private String jobDescription;

	@NotNull
	@NotBlank
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;	
	
	@NotNull
	@NotBlank
	@Column(name = "published_at")
	private LocalDate publishedAt=LocalDate.now();
	
	@NotNull
	@NotBlank
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@NotNull
	@NotBlank
	@Column(name = "is_active")
	private boolean isActive=true;
	
	@NotNull
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@NotNull
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;
	
	@NotNull
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
}
