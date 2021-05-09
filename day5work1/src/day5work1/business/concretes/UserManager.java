package day5work1.business.concretes;

import day5work1.business.abstracts.LoginService;

import day5work1.business.abstracts.UserService;
import day5work1.core.abstracts.OutSourceService;
import day5work1.entities.concretes.User;

public class UserManager implements UserService{

	private LoginService loginService;
	private OutSourceService outService;
	
	public UserManager(LoginService loginService, OutSourceService outService) {
		super();
		this.loginService = loginService;
		this.outService = outService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void login(String email, String password) {
	loginService.login(email, password);
	}

	@Override
	public void loginWithService() {

    outService.loginWith();
		
	}

	@Override
	public void registerWithService() {
		outService.registerWith();
		
	}

}
