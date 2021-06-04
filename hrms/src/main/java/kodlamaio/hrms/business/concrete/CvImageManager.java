package kodlamaio.hrms.business.concrete;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.core.utilities.image.ImageService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvImageDao;
import kodlamaio.hrms.entities.concrete.CvImage;

@Service
public class CvImageManager implements CvImageService{

	private CvImageDao cvImageDao;
	private ImageService imageService;
	
	public CvImageManager(CvImageDao cvImageDao, ImageService imageService) {
		super();
		this.cvImageDao = cvImageDao;
		this.imageService = imageService;
	}

	@Override
	public Result add(CvImage cvImage, MultipartFile multipartFile) {
		Map<String,String> addedImage = this.imageService.add(multipartFile).getData();
        cvImage.setUrl(addedImage.get("url"));
        this.cvImageDao.save(cvImage);
        return new SuccessResult("added");
	}

}
