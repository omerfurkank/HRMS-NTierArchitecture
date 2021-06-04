package kodlamaio.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.CvImage;

public interface CvImageService {

	Result add(CvImage cvImage, MultipartFile multipartFile);
}
