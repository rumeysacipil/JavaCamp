package day5work1.core.concretes;

import day5work1.core.abstracts.EmailVerificationService;
import day5work1.entities.concretes.User;


public class EmaiilVerificationManager implements EmailVerificationService {

	@Override
	public void emailverification(User user) {
	System.out.println("-------------------------------------------------");
	System.out.println(user.getEmail() +" e-postan�za g�nderilen do�rulama linkine t�klay�n�z");
	}

	@Override
	public boolean verification(User user) {
		System.out.println(user.getFirstName()+""+user.getLastName()+" e-posta adresiniz ba�ar�yla do�ruland� ");
		return true;
		
		
	}

}
