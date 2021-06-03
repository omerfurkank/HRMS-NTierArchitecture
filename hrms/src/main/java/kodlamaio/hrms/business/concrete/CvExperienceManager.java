package kodlamaio.hrms.business.concrete;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CvExperienceDao;
import kodlamaio.hrms.entities.concrete.CvExperience;

@Service
public class CvExperienceManager implements CvExperienceService {

	private CvExperienceDao cvExperienceDao;
	
	@Autowired
	public CvExperienceManager(CvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}
	@Override
	public DataResult<List<CvExperience>> getAllByCandidate_IdOrderByLeaveYear(int candidateId) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.getAllByCandidate_IdOrderByLeaveYear(candidateId));
	}

	
}
