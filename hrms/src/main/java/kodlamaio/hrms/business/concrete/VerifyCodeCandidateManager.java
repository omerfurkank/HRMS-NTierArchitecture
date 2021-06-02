package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerifyCodeCandidateService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerifyCodeCandidateDao;
import kodlamaio.hrms.entities.concrete.VerifyCodeCandidate;

@Service
public class VerifyCodeCandidateManager implements VerifyCodeCandidateService {

	private VerifyCodeCandidateDao verifyCodeCandidateDao;
	
	@Autowired
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
