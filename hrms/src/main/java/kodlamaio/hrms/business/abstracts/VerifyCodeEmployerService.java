package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.VerifyCodeEmployer;

public interface VerifyCodeEmployerService {

	Result add(VerifyCodeEmployer verifyCodeEmployer);
	
	Result update(VerifyCodeEmployer codeEmployer);
	
	DataResult<VerifyCodeEmployer> getByEmployerId(int id);
}
