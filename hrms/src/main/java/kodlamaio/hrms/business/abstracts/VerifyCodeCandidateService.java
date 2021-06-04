package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.VerifyCodeCandidate;

public interface VerifyCodeCandidateService {

	Result add(VerifyCodeCandidate verifyCodeCandidate);
	
	Result update(VerifyCodeCandidate verifyCodeCandidate);
	
	DataResult<VerifyCodeCandidate> getByCandidateId(int id);
	
}
