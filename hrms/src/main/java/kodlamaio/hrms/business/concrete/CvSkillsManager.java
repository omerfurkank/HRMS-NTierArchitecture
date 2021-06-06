package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvSkillsService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvSkillsDao;
import kodlamaio.hrms.entities.concrete.CvSkills;

@Service
public class CvSkillsManager implements CvSkillsService {

	private CvSkillsDao cvSkillsDao;

	@Autowired
	public CvSkillsManager(CvSkillsDao cvSkillsDao) {
		super();
		this.cvSkillsDao = cvSkillsDao;
	}

	@Override
	public Result add(CvSkills cvSkills) {
		this.cvSkillsDao.save(cvSkills);
		return new SuccessResult("added");
	}
}
