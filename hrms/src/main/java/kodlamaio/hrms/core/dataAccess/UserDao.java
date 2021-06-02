package kodlamaio.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User getByEmail(String email);
}
