package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvLinkService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvLink;

@RestController
@RequestMapping("/api/cvLinks")
public class CvLinksController {

	private CvLinkService cvLinkService;

	@Autowired
	public CvLinksController(CvLinkService cvLinkService) {
		super();
		this.cvLinkService = cvLinkService;
	}
	
	@PostMapping("add")
	public Result add(CvLink cvLink) {
		return this.cvLinkService.add(cvLink);
	}
}
