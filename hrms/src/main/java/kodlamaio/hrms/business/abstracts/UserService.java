package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.entities.abstracts.User;
import kodlamaio.hrms.core.utilities.results.DataResult;

public interface UserService {

	DataResult<User> getByEmail(String email);
	
}
