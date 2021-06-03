package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvLink;

public interface CvLinkDao extends JpaRepository<CvLink, Integer> {

	List<CvLink> getAllByCandidate_Id(int candidateId);
}
