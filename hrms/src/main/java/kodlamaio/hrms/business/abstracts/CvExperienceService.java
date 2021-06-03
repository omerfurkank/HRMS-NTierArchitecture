package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concrete.CvExperience;

public interface CvExperienceService {

	DataResult<List<CvExperience>> getAllByCandidate_IdOrderByLeaveYear(int candidateId);
}
