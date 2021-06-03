package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvLanguage;

public interface CvLanguageDao extends JpaRepository<CvLanguage, Integer>{

	List<CvLanguage> getAllByCandidate_Id(int candidateId);
}
