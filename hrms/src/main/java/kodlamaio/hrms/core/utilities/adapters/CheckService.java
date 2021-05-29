package kodlamaio.hrms.core.utilities.adapters;

import java.util.Date;

import kodlamaio.hrms.core.utilities.results.Result;

public interface CheckService {

	Result checkIfRealPerson(String tcno,String firsName,String lastName,Date birthDate);
}
