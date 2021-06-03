package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvImage;

public interface CvImageDao extends JpaRepository<CvImage, Integer> {

	CvImage getByCandidate_Id(int candidateId);
}
