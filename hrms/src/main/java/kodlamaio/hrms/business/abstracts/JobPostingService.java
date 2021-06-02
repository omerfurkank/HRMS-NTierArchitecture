package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.JobPosting;

public interface JobPostingService {

	DataResult<List<JobPosting>> getByIsActiveTrue();
	
	DataResult<List<JobPosting>> getByIsActiveTrueOrderByPublishedAt();
	
	DataResult<List<JobPosting>> getByIsActiveTrueAndEmployer_Id(int id);
	
	Result add(JobPosting jobPosting);
	
	Result setPassive(int id);
}
