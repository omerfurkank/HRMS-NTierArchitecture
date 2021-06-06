package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.Candidate;
import kodlamaio.hrms.entities.concrete.CvImage;

@RestController
@RequestMapping("/api/cvImages")
public class CvImagesController {

	private CvImageService cvImageService;
	private CandidateService candidateService;

	@Autowired
	public CvImagesController(CvImageService cvImageService, CandidateService candidateService) {
		super();
		this.cvImageService = cvImageService;
		this.candidateService = candidateService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam int candidateId, @RequestBody MultipartFile multipartFile) {
		Candidate candidate = this.candidateService.getById(candidateId).getData();
		CvImage addedImage= new CvImage();
		addedImage.setCandidate(candidate);
		return this.cvImageService.add(addedImage, multipartFile);
	}
}
