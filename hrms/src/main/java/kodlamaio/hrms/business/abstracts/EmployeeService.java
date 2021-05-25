package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.Employee;

public interface EmployeeService {

	Result add(Employee employee);
}
