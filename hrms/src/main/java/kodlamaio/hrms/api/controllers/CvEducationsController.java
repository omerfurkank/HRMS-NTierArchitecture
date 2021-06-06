package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvEducation;

@RestController
@RequestMapping("/api/cvEducations")
public class CvEducationsController {

	private CvEducationService cvEducationService;

	@Autowired
	public CvEducationsController(CvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}
	
	@GetMapping("/getAllByCandidate_idOrderByGraduationYear")
	public DataResult<List<CvEducation>> getAllByCandidate_idOrderByGraduationYear(@RequestParam int candidateId){
		return this.cvEducationService.getAllByCandidate_idOrderByGraduationYear(candidateId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvEducation cvEducation) {
		return this.cvEducationService.add(cvEducation);
	}
}
