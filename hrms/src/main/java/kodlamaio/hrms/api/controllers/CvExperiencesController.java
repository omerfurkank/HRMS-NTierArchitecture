package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvExperience;

@RestController
@RequestMapping("/api/cvExperiences")
public class CvExperiencesController {

	@Autowired
	private CvExperienceService cvExperienceService;

	public CvExperiencesController(CvExperienceService cvExperienceService) {
		super();
		this.cvExperienceService = cvExperienceService;
	}
	
	public DataResult<List<CvExperience>> getAllByCandidate_IdOrderByLeaveYear(int candidateId){
		return this.cvExperienceService.getAllByCandidate_IdOrderByLeaveYear(candidateId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvExperience cvExperience) {
		return this.cvExperienceService.add(cvExperience);
	}
}
