package kodlamaio.hrms.core.utilities.adapters;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.fakeMernisService.FakeMernis;

@Service
public class MernisCheckServiceAdapter implements CheckService {

	@Override
	public Result checkIfRealPerson(String tcno,String firsName,String lastName,LocalDate birthDate) {
		FakeMernis fakeMernis=new FakeMernis();
		if(fakeMernis.checkMernis(tcno, firsName, lastName, birthDate)) {
			return new SuccessResult();
		}
		else {
			return new ErrorResult("not a real person");
		}
	}

}
