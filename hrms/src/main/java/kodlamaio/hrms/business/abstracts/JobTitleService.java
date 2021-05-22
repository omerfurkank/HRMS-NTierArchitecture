package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concrete.JobTitle;

public interface JobTitleService {

	List<JobTitle> getAll();
}
