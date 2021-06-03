package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvExperience;

public interface CvExperienceDao extends JpaRepository<CvExperience, Integer> {

	List<CvExperience> getAllByCandidate_Id(int candidateId);
	
	List<CvExperience> getAllByCandidate_IdOrderByLeaveYear(int candidateId);

}
