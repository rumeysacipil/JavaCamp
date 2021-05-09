package day5work1.business.concretes;

import day5work1.business.abstracts.LoginService;


import day5work1.core.abstracts.CheckService;
import day5work1.core.abstracts.EmailVerificationService;
import day5work1.dataAccess.abstracts.UserDao;
import day5work1.entities.concretes.User;


public class LoginManager implements LoginService {
     
	private UserDao userDao;
	private CheckService checkService;
	private EmailVerificationService emailService;
	
	
	public LoginManager(UserDao userDao, CheckService checkService, EmailVerificationService emailService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.emailService = emailService;
	}

	@Override
	public void emailAvailable(String email) {
		for(User user: userDao.getAll()) {
			if(user.getEmail() == email) {
				throw new ArithmeticException("e posta zaten mevcut!");
			}
		}
			
		
	}

	@Override
	public void login(String email, String password) {
		if(!checkService.checkemail(email)) {
			return;
		}
		if(!checkService.checkpassword(password)) {
			return;
		}
		for(User user:userDao.getAll()) {
			if(email==user.getEmail() && password==user.getPassword()) {
			System.out.println(user.getFirstName()+user.getLastName()+" ba�ar�yla giri� yapt�n�z");
				return;
			}
		}
			
				throw new ArithmeticException("Hatal� e-posta ve parola girdiniz.Tekrar giri� yap�n�z!");
			
		
	}
   
	@Override
	public void register(User user) {
		
		if(!checkService.checkemail(user.getEmail())) {
			return;		}
		System.out.println("Email kontrol� ba�ar�l�");
		
		if(!checkService.checkpassword(user.getPassword())) {
			return;
		}
		System.out.println("�ifre kontrol� ba�ar�l�");
		if(!checkService.checkfirstName(user.getFirstName())) {
			return;
		}
		System.out.println("�sim kontrol� ba�ar�l�");
		if(!checkService.checklastName(user.getLastName())) {
			return;
		}
		System.out.println("Soyad kontrol� ba�ar�l�");
	     emailService.emailverification(user);
	     emailService.verification(user);
	     userDao.add(user);
	     System.out.println(user.getFirstName()+" "+user.getLastName()+ " kay�t i�leminiz ba�ar�yla ger�ekle�ti");
	}

}
