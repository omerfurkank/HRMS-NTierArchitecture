package kodlamaio.hrms.core.utilities.verification;

public interface VerificationService {

	void sendEmailLink(String email);
	
	String generateEmailCode();
	
	void verifyByEmployee();
}
