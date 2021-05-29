package kodlamaio.hrms.business.concrete;

import kodlamaio.hrms.business.abstracts.VerifyCodeCandidateService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerifyCodeCandidateDao;
import kodlamaio.hrms.entities.concrete.VerifyCodeCandidate;

public class VerifyCodeCandidateManager implements VerifyCodeCandidateService {

	private VerifyCodeCandidateDao verifyCodeCandidateDao;
	public VerifyCodeCandidateManager(VerifyCodeCandidateDao verifyCodeCandidateDao) {
		super();
		this.verifyCodeCandidateDao = verifyCodeCandidateDao;
	}
	@Override
	public Result add(VerifyCodeCandidate verifyCodeCandidate) {
		this.verifyCodeCandidateDao.save(verifyCodeCandidate);
		return new SuccessResult("added");
	}

}
