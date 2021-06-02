package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	
	List<JobPosting> getByIsActiveTrue();
	
	List<JobPosting> getByIsActiveTrueOrderByPublishedAt();
	
	List<JobPosting> getByIsActiveTrueAndEmployer_Id(int id);
}
