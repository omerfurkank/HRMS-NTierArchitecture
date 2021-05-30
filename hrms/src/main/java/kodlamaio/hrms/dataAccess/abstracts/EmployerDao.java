package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Employer getByEmail(String email);
}
