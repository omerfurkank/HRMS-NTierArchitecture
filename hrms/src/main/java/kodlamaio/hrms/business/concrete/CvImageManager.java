package kodlamaio.hrms.business.concrete;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.core.utilities.image.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvImageDao;
import kodlamaio.hrms.entities.concrete.CvImage;

@Service
public class CvImageManager implements CvImageService{

	private CvImageDao cvImageDao;
	private ImageService imageService;
	
	@Autowired
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

	@Override
	public DataResult<CvImage> getByCandidateId(int id) {
		return new SuccessDataResult<CvImage>(this.cvImageDao.getByCandidate_Id(id));
	}

}
