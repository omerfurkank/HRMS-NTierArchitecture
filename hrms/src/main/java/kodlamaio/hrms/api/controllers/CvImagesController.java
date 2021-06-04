package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvImage;

@RestController
@RequestMapping("/api/cvImages")
public class CvImagesController {

	private CvImageService cvImageService;

	@Autowired
	public CvImagesController(CvImageService cvImageService) {
		super();
		this.cvImageService = cvImageService;
	}
	
	public Result add(int id, MultipartFile multipartFile) {
		CvImage addedImage= this.cvImageService.getByCandidateId(id).getData();
		return this.cvImageService.add(addedImage, multipartFile);
	}
}
