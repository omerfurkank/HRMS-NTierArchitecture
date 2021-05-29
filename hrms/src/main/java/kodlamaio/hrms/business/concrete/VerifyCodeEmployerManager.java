package kodlamaio.hrms.business.concrete;

import kodlamaio.hrms.business.abstracts.VerifyCodeEmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerifyCodeEmployerDao;
import kodlamaio.hrms.entities.concrete.VerifyCodeEmployer;

public class VerifyCodeEmployerManager implements VerifyCodeEmployerService {
 private VerifyCodeEmployerDao verifyCodeEmployerDao;

public VerifyCodeEmployerManager(VerifyCodeEmployerDao verifyCodeEmployerDao) {
	super();
	this.verifyCodeEmployerDao = verifyCodeEmployerDao;
}

@Override
public Result add(VerifyCodeEmployer verifyCodeEmployer) {
	this.verifyCodeEmployerDao.save(verifyCodeEmployer);
	return new SuccessResult("added");
}

}
