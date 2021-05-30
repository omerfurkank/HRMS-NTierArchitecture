package kodlamaio.hrms.business.concrete;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.entities.abstracts.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {

	private UserDao userdao;
	
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userdao.getByEmail(email));
	}

}
