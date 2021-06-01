package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.dtos.RegisterEmployerDto;

public interface AuthService {

	Result registerCandidate(RegisterCandidateDto registerCandidateDto);
	
	Result registerEmployer(RegisterEmployerDto registerEmployerDto);
	
}
