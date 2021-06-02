package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerifyCodeEmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerifyCodeEmployerDao;
import kodlamaio.hrms.entities.concrete.VerifyCodeEmployer;

@Service
public class VerifyCodeEmployerManager implements VerifyCodeEmployerService {
	
	private VerifyCodeEmployerDao verifyCodeEmployerDao;

	 @Autowired
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
