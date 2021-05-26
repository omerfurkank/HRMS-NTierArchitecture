package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface AuthService {

	Result login();
	Result registerCandidate();
	Result registerEmployer();
	
}
