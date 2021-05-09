package day5work1.core.adapters;

import day5work1.GoogleLogin.concretes.GoogleLoginManager;
import day5work1.core.abstracts.OutSourceService;

public class GoogleLoginManagerAdapter implements OutSourceService {

	@Override
	public void registerWith() {
		GoogleLoginManager googleLoginManager=new GoogleLoginManager();
		googleLoginManager.register();
	}

	@Override
	public void loginWith() {
    GoogleLoginManager googleLoginManager=new GoogleLoginManager();
    googleLoginManager.login();
		
	}

}
