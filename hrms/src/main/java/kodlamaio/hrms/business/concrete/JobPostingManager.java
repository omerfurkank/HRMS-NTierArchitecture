package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concrete.JobPosting;

@Service
public class JobPostingManager implements JobPostingService {

	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public DataResult<List<JobPosting>> getByIsActiveTrue() {

		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobPosting>> getByIsActiveTrueOrderByPublishedAt() {

		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActiveTrueOrderByPublishedAt());
	}

	@Override
	public DataResult<List<JobPosting>> getByIsActiveTrueAndEmployer_Id(int id) {
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getByIsActiveTrueAndEmployer_Id(id));
	}

	@Override
	public Result add(JobPosting jobPosting) {
		
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("added");
	}

	@Override
	public Result setPassive(int id) {
		
		JobPosting passivedJobPosting = this.jobPostingDao.findById(id).get();
		passivedJobPosting.setActive(false);
		
		return new SuccessResult("set passived");
	}

}
