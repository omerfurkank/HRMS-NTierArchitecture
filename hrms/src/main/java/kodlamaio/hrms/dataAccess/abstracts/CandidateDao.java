package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

	Candidate getByIdentityNumber(String identityNumber);
}
