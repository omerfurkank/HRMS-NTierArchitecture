package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.CvEducationDao;
import kodlamaio.hrms.dataAccess.abstracts.CvExperienceDao;
import kodlamaio.hrms.dataAccess.abstracts.CvImageDao;
import kodlamaio.hrms.dataAccess.abstracts.CvLanguageDao;
import kodlamaio.hrms.dataAccess.abstracts.CvLinkDao;
import kodlamaio.hrms.dataAccess.abstracts.CvSkillsDao;
import kodlamaio.hrms.entities.concrete.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private CvEducationDao cvEducationDao;
	private CvExperienceDao cvExperienceDao;
	private CvSkillsDao cvSkillsDao;
	private CvLanguageDao cvLanguageDao;
	private CvImageDao cvImageDao;
	private CvLinkDao cvLinkDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, CvEducationDao cvEducationDao, CvExperienceDao cvExperienceDao,
			CvSkillsDao cvSkillsDao, CvLanguageDao cvLanguageDao, CvImageDao cvImageDao, CvLinkDao cvLinkDao) {
		super();
		this.candidateDao = candidateDao;
		this.cvEducationDao = cvEducationDao;
		this.cvExperienceDao = cvExperienceDao;
		this.cvSkillsDao = cvSkillsDao;
		this.cvLanguageDao = cvLanguageDao;
		this.cvImageDao = cvImageDao;
		this.cvLinkDao = cvLinkDao;
	}

	@Override
	public Result add(Candidate candidate) {
		candidateDao.save(candidate);
		return new SuccessResult("added");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(), "listed");
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByIdentityNumber(identityNumber));
	}

	@Override
	public DataResult<CandidateCvDto> getCvById(int id) {
		CandidateCvDto candidateCvDto=new CandidateCvDto();
		candidateCvDto.setCandidate(this.candidateDao.getOne(id));
		candidateCvDto.setCvEducations(this.cvEducationDao.getAllByCandidate_Id(id));
		candidateCvDto.setCvExperiences(this.cvExperienceDao.getAllByCandidate_Id(id));
		candidateCvDto.setCvLanguages(this.cvLanguageDao.getAllByCandidate_Id(id));
		candidateCvDto.setCvLinks(this.cvLinkDao.getAllByCandidate_Id(id));
		candidateCvDto.setCvSkills(this.cvSkillsDao.getAllByCandidate_Id(id));
		candidateCvDto.setCvImage(this.cvImageDao.getByCandidate_Id(id));
		
		return new SuccessDataResult<CandidateCvDto>(candidateCvDto);
	}

}
