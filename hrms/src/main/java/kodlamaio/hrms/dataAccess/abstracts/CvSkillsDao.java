package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvSkills;

public interface CvSkillsDao extends JpaRepository<CvSkills, Integer>{

	
}
