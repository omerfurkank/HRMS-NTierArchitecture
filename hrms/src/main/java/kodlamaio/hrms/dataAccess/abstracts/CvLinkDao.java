package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CvLink;

public interface CvLinkDao extends JpaRepository<CvLink, Integer> {

}
