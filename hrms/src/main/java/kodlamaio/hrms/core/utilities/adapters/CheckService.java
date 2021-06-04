package kodlamaio.hrms.core.utilities.adapters;

import java.time.LocalDate;

import kodlamaio.hrms.core.utilities.results.Result;

public interface CheckService {

	Result checkIfRealPerson(String tcno,String firsName,String lastName,LocalDate birthDate);
}
