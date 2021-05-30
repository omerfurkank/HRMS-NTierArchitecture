package kodlamaio.hrms.business.concrete;

import java.util.Date;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.VerifyCodeCandidateService;
import kodlamaio.hrms.business.abstracts.VerifyCodeEmployerService;
import kodlamaio.hrms.core.utilities.adapters.CheckService;
import kodlamaio.hrms.core.utilities.business.BusinessRules;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verification.VerificationService;
import kodlamaio.hrms.entities.concrete.Candidate;
import kodlamaio.hrms.entities.concrete.Employer;
import kodlamaio.hrms.entities.concrete.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.concrete.dtos.RegisterEmployerDto;

public class AuthManager implements AuthService {

	private UserService userService;
	private CandidateService candidateService;
	private EmployerService employerService;
	private VerificationService verificationService;
	private VerifyCodeCandidateService verifyCodeCandidateService;
	private VerifyCodeEmployerService verifyCodeEmployerService;
	private CheckService checkService;
	private ModelMapper modelMapper;
	
	@Autowired
	public AuthManager(UserService userService,CandidateService candidateService, EmployerService employerService,
			VerificationService verificationService, VerifyCodeCandidateService verifyCodeCandidateService,
			VerifyCodeEmployerService verifyCodeEmployerService, ModelMapper modelMapper, CheckService checkService) {
		super();
		this.userService=userService;
		this.candidateService = candidateService;
		this.employerService = employerService;
		this.verificationService = verificationService;
		this.verifyCodeCandidateService = verifyCodeCandidateService;
		this.verifyCodeEmployerService = verifyCodeEmployerService;
		this.checkService = checkService;
		this.modelMapper=modelMapper;
	}

	@Override
	public Result registerCandidate(RegisterCandidateDto registerCandidateDto) {

		Result result= BusinessRules.run(
				checkMissingInfoCandidate(registerCandidateDto),
				checkPasswordConfirm(registerCandidateDto.getPassword(), registerCandidateDto.getPasswordConfirm()),
				checkIfRealPerson(registerCandidateDto.getIdentityNumber(), registerCandidateDto.getFirstName(),registerCandidateDto.getLastName(), registerCandidateDto.getBirthDate()),
				checkIfCandidateExistsByIDNo(registerCandidateDto.getIdentityNumber()),
				checkIfUserExistsByEmail(registerCandidateDto.getEmail())
				);
		if (!result.isSuccess()) {
			return result;
		}
		
		Candidate registeredCandidate= modelMapper.map(registerCandidateDto, Candidate.class);
		verificationService.generateEmailCode();
		verificationService.sendEmailLink(registeredCandidate.getEmail());
		
		return this.candidateService.add(registeredCandidate);
		
	}

	@Override
	public Result registerEmployer(RegisterEmployerDto registerEmployerDto) {
		
		Result result = BusinessRules.run(
				checkMissingInfoEmployer(registerEmployerDto),
				checkPasswordConfirm(registerEmployerDto.getPassword(), registerEmployerDto.getPasswordConfirm()),
				checkEmailDomain(registerEmployerDto.getEmail(), registerEmployerDto.getWebAdress()),
				checkIfUserExistsByEmail(registerEmployerDto.getEmail())
				);
		if (!result.isSuccess()) {
			return result;
		}
		
		Employer registeredEmployer=modelMapper.map(registerEmployerDto, Employer.class);
		verificationService.generateEmailCode();
		verificationService.sendEmailLink(registeredEmployer.getEmail());
		
		return this.employerService.add(registeredEmployer);
	}
	
	
	private Result checkIfRealPerson(String tcno,String firsName,String lastName,Date birthDate) {
		 return this.checkService.checkIfRealPerson(tcno, firsName, lastName, birthDate);
		
	}
	
	private Result checkIfUserExistsByEmail(String email) {
		if (this.userService.getByEmail(email).getData()==null) {
			return new SuccessResult();
		}
			return new ErrorResult("this user already exists");
	}
	
	private Result checkPasswordConfirm(String password,String passwordConfirm) {
		if (password.equals(passwordConfirm)) {
			return new SuccessResult();
		}
		return new ErrorResult("passwords do not match");
	}
	
	private Result checkIfCandidateExistsByIDNo(String identityNumber) {
		if(this.candidateService.getByIdentityNumber(identityNumber).getData()==null) {
			return new SuccessResult();
		}
		return new ErrorResult("this user already exists");
	}
	
	
	private Result checkMissingInfoCandidate(RegisterCandidateDto registerCandidateDto) {
		if (registerCandidateDto.getFirstName()==null || registerCandidateDto.getLastName()==null || registerCandidateDto.getEmail()==null || 
		    registerCandidateDto.getBirthDate()==null || registerCandidateDto.getPassword()==null || registerCandidateDto.getPasswordConfirm()==null ||
		    registerCandidateDto.getIdentityNumber()==null) {
			return new ErrorResult("please fill the all fields");
		}
		return new SuccessResult();
	}
	
	private Result checkMissingInfoEmployer(RegisterEmployerDto registerEmployerDto) {
		if (registerEmployerDto.getCompanyName()==null || registerEmployerDto.getPhoneNumber()==null || registerEmployerDto.getEmail()==null ||
			registerEmployerDto.getWebAdress()==null || registerEmployerDto.getPassword()==null || registerEmployerDto.getPasswordConfirm()==null ) {
			return new ErrorResult("please fill the all fields");
		}
		return new SuccessResult();
	}
	
	
	private Result checkEmailDomain(String email,String website) {
		String[] emailSplit = email.split("@");
		if (emailSplit[1].equals(website)) {
			return new SuccessResult();
		}
		return new ErrorResult("email do nat match website domain");
	}
	
	
	

}
