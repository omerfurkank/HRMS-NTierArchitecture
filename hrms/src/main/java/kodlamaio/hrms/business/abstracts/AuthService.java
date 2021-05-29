package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.concrete.dtos.RegisterEmployerDto;

public interface AuthService {

	Result registerCandidate(RegisterCandidateDto registerCandidateDto);
	
	Result registerEmployer(RegisterEmployerDto registerEmployerDto);
	
}
