package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.dtos.RegisterEmployerDto;
import kodlamaio.hrms.entities.dtos.VerifyCandidateDto;
import kodlamaio.hrms.entities.dtos.VerifyEmployerDto;

public interface AuthService {

	Result registerCandidate(RegisterCandidateDto registerCandidateDto);
	
	Result registerEmployer(RegisterEmployerDto registerEmployerDto);
	
	Result verifyCandidate(VerifyCandidateDto verifyCandidateDto);
	
	Result verifyEmployer(VerifyEmployerDto verifyEmployerDto);
}
