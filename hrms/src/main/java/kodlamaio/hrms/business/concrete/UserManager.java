package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.dataAccess.UserDao;
import kodlamaio.hrms.core.entities.abstracts.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

@Service
public class UserManager implements UserService {

	private UserDao userdao;
	
	@Autowired
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userdao.getByEmail(email));
	}

}
