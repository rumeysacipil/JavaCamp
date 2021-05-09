package day5work1.core.concretes;

import day5work1.core.abstracts.EmailVerificationService;
import day5work1.entities.concretes.User;


public class EmaiilVerificationManager implements EmailVerificationService {

	@Override
	public void emailverification(User user) {
	System.out.println("-------------------------------------------------");
	System.out.println(user.getEmail() +" e-postanýza gönderilen doðrulama linkine týklayýnýz");
	}

	@Override
	public boolean verification(User user) {
		System.out.println(user.getFirstName()+""+user.getLastName()+" e-posta adresiniz baþarýyla doðrulandý ");
		return true;
		
		
	}

}
