package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
