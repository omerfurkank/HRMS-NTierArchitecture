package kodlamaio.hrms.business.concrete;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.VerifyCodeCandidateService;
import kodlamaio.hrms.business.abstracts.VerifyCodeEmployerService;
import kodlamaio.hrms.core.utilities.adapters.CheckService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.verification.VerificationService;
import kodlamaio.hrms.entities.concrete.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.concrete.dtos.RegisterEmployerDto;

public class AuthManager implements AuthService {

	private CandidateService candidateService;
	private EmployerService employerService;
	private VerificationService service;
	private VerifyCodeCandidateService verifyCodeCandidateService;
	private VerifyCodeEmployerService verifyCodeEmployerService;
	private CheckService checkService;
	
	@Autowired
	public AuthManager(CandidateService candidateService, EmployerService employerService, VerificationService service,
			VerifyCodeCandidateService verifyCodeCandidateService, VerifyCodeEmployerService verifyCodeEmployerService,
			CheckService checkService) {
		super();
		this.candidateService = candidateService;
		this.employerService = employerService;
		this.service = service;
		this.verifyCodeCandidateService = verifyCodeCandidateService;
		this.verifyCodeEmployerService = verifyCodeEmployerService;
		this.checkService = checkService;
	}

	@Override
	public Result registerCandidate(RegisterCandidateDto registerCandidateDto) {

		
		return null;
	}

	@Override
	public Result registerEmployer(RegisterEmployerDto registerEmployerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Result checkIfRealPerson(String tcno,String firsName,String lastName,Date birthDate) {
		 return this.checkService.checkIfRealPerson(tcno, firsName, lastName, birthDate);
		
	}

}
