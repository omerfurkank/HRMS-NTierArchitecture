package kodlamaio.hrms.core.utilities.adapters;

import java.util.Date;

import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.fakeMernisService.FakeMernis;

public class MernisCheckServiceAdapter implements CheckService {

	@Override
	public Result checkIfRealPerson(String tcno,String firsName,String lastName,Date birthDate) {
		FakeMernis fakeMernis=new FakeMernis();
		if(fakeMernis.checkMernis(tcno, firsName, lastName, birthDate)) {
			return new SuccessResult();
		}
		else {
			return new ErrorResult("not a real person");
		}
	}

}
