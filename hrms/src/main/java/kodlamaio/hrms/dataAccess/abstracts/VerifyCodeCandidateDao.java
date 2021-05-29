package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.VerifyCodeCandidate;

public interface VerifyCodeCandidateDao extends JpaRepository<VerifyCodeCandidate, Integer> {

}
