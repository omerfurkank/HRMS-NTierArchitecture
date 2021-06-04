package kodlamaio.hrms.core.utilities.image;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

public class CloudinaryManager implements ImageService {

	private Cloudinary cloudinary;
	@Override
	public DataResult<Map<String, String>> add(MultipartFile multipartFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> result = (Map<String, String>)cloudinary.uploader().upload(multipartFile.getBytes(),ObjectUtils.emptyMap());
            
            return new SuccessDataResult<Map<String, String>>(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ErrorDataResult<Map<String, String>>();
	}

}
