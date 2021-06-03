package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concrete.Candidate;
import kodlamaio.hrms.entities.concrete.CvEducation;
import kodlamaio.hrms.entities.concrete.CvExperience;
import kodlamaio.hrms.entities.concrete.CvImage;
import kodlamaio.hrms.entities.concrete.CvLanguage;
import kodlamaio.hrms.entities.concrete.CvLink;
import kodlamaio.hrms.entities.concrete.CvSkills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateCvDto {

	private Candidate candidate;
	private CvImage cvImage;
	private List<CvExperience> cvExperiences;
	private List<CvEducation> cvEducations;
	private List<CvSkills> cvSkills;
	private List<CvLanguage> cvLanguages;
	private List<CvLink> cvLinks;
	
}
