package kodlamaio.hrms.business.concrete;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concrete.Candidate;

public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {
		candidateDao.save(candidate);
		return new SuccessResult("added");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(), "listed");
	}

}