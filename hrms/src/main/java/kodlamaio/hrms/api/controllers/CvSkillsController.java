package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvSkillsService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvSkills;

@RestController
@RequestMapping("/api/cvSkills")
public class CvSkillsController {

	private CvSkillsService cvSkillsService;

	@Autowired
	public CvSkillsController(CvSkillsService cvSkillsService) {
		super();
		this.cvSkillsService = cvSkillsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSkills cvSkills) {
		return this.cvSkillsService.add(cvSkills);
	}
	
}
