package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.JobPosting;

@RestController
@RequestMapping("/api/jobPostings")
public class JobPostingsController {
	
	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}

	@GetMapping("/getByIsActiveTrue")
	public DataResult<List<JobPosting>> getByIsActiveTrue(){
		return this.getByIsActiveTrue();
	}
	
	@GetMapping("/getByIsActiveTrueOrderByPublishedAt")
	public DataResult<List<JobPosting>> getByIsActiveTrueOrderByPublishedAt(){
		return this.jobPostingService.getByIsActiveTrueOrderByPublishedAt();
	}
	
	@GetMapping("/getByIsActiveTrueAndEmployer_Id")
	public DataResult<List<JobPosting>> getByIsActiveTrueAndEmployer_Id(@RequestParam int id){
		return this.jobPostingService.getByIsActiveTrueAndEmployer_Id(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}

}
