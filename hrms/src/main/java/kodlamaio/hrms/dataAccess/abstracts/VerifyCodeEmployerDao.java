package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.VerifyCodeEmployer;

public interface VerifyCodeEmployerDao extends JpaRepository<VerifyCodeEmployer, Integer>{

}
