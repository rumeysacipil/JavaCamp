package day5work1;

import day5work1.business.abstracts.UserService;

import day5work1.business.concretes.LoginManager;
import day5work1.business.concretes.UserManager;

import day5work1.core.adapters.GoogleLoginManagerAdapter;
import day5work1.core.concretes.CheckManager;
import day5work1.core.concretes.EmaiilVerificationManager;

import day5work1.dataAccess.concretes.InMemoryUserDao;
import day5work1.entities.concretes.User;




public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new LoginManager(new InMemoryUserDao(), new CheckManager(), new EmaiilVerificationManager()), 
				  new GoogleLoginManagerAdapter());
	     EmaiilVerificationManager emaiilVerificationManager=new EmaiilVerificationManager();
		 InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		 CheckManager checkManager=new CheckManager();
		    User user1=new User();
			user1.setFirstName("Rumeysa");
			user1.setLastName("çipil");
			user1.setEmail("rmysssa@gmail.com");
			user1.setPassword("123456");
	        userService.register(user1);
			System.out.println("------------------------------------------");
			
			User users2=new User();
			
			users2.setFirstName("sema");
			users2.setLastName("yeþildaþ");
			users2.setEmail("semayesildas@gmail.com");
			users2.setPassword("93470307");
			userService.register(users2);
			System.out.println("------------------------------------------");
			
			User users3=new User();
			
			users3.setFirstName("tugba");
			users3.setLastName("yýldýz");
			users3.setEmail("tugbayildiz@gmail.com");
			users3.setPassword("27145245");
			userService.register(users3);
			System.out.println("------------------------------------------");
			
			userService.login("tugbayildiz@gmail.com", "27154511");
			userService.login("semayesildas@gmail.com", "93470307");
			System.out.println("------------------------------------------");
		     
			System.out.println(checkManager.checkfirstName(user1.getFirstName()));
			System.out.println(checkManager.checkpassword(users3.getPassword()));
			System.out.println("------------------------------------------");
		     
		userService.loginWithService();
		userService.registerWithService();
		
		
		emaiilVerificationManager.emailverification(user1);
		emaiilVerificationManager.verification(users2);
		System.out.println("------------------------------------------");
		
		inMemoryUserDao.add(users3);
		inMemoryUserDao.delete(user1);
	}

}
