package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.RegisterCandidateDto;
import kodlamaio.hrms.entities.dtos.RegisterEmployerDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerCandidate")
	public Result registerCandidate(@RequestBody RegisterCandidateDto registerCandidateDto) {
		return this.authService.registerCandidate(registerCandidateDto);
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody RegisterEmployerDto registerEmployerDto) {
		return this.authService.registerEmployer(registerEmployerDto);
	}

}
