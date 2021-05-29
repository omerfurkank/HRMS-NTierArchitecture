package kodlamaio.hrms.core.utilities.verification;

import java.util.UUID;

public class VerificationManager implements VerificationService {

	@Override
	public void sendEmailLink(String email) {
		
		UUID generatedLink=UUID.randomUUID();
		String emailLink="https://www.hrmsverification.com/" + generatedLink.toString();
		System.out.println("Please check your message box "+email+" Click on the link to verify your account"+emailLink);
		
	}

	@Override
	public String generateEmailCode() {
		UUID generatedCode=UUID.randomUUID();
		System.out.println("Your verification code is "+ generatedCode.toString());
		return generatedCode.toString();
	}

	@Override
	public void verifyByEmployee() {
		System.out.println("Verified by our emplayee");
		
	}

}
