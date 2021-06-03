package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvEducation;

public interface CvEducationDao extends JpaRepository<CvEducation, Integer>{

	List<CvEducation> getAllByCandidate_Id(int candidateId);
	
	List<CvEducation> getAllByCandidate_idOrderByGraduationYear(int candidateId);
}
