package day5work1.GoogleLogin.concretes;

import day5work1.GoogleLogin.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService{

	@Override
	public void register() {
		System.out.println("Google hesab�n�z ile oturum a�t�n�z");
		
	}

	@Override
	public void login() {
		System.out.println("Google hesab�n�z ile giri� yapt�n�z");
		
	}

}
