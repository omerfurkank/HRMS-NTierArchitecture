package kodlamaio.hrms.core.utilities.image;


import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;

public interface ImageService {

	DataResult<Map<String, String>> add(MultipartFile multipartFile);
}
