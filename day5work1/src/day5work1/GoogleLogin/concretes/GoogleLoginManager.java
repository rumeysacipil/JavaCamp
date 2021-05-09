package day5work1.GoogleLogin.concretes;

import day5work1.GoogleLogin.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService{

	@Override
	public void register() {
		System.out.println("Google hesabýnýz ile oturum açtýnýz");
		
	}

	@Override
	public void login() {
		System.out.println("Google hesabýnýz ile giriþ yaptýnýz");
		
	}

}
