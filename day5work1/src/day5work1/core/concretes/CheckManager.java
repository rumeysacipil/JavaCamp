package day5work1.core.concretes;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import day5work1.core.abstracts.CheckService;
import java.lang.ArithmeticException;

public class CheckManager implements CheckService{

	@Override
	public boolean checkfirstName(String firstName) {
		if(firstName.length()>1) {
			return true;
		}
		else {
			throw new ArithmeticException("Ýsminiz en az 2 karakterden oluþmalýdýr!");

		}
	}

	@Override
	public boolean checklastName(String lastName) {
		if(lastName.length()>1) {
			return true;
		}
		else {
			throw new ArithmeticException("Ýsminiz en az 2 karakterden oluþmalýdýr!");
		}
	}

	@Override
	public boolean checkemail(String email) {
		
		Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher m = p.matcher(email);



		if (m.find()) {
			return true;
		} else {
			System.out.println("Geçerli bir e-posta adresi giriniz!");
			return false;
		}
	}

	@Override
	public boolean checkpassword(String password) {
		if(password.length()>5) {
			return true;
		}
		else {
			throw new ArithmeticException("parolanýz en az 6 karakterden oluþmalýdýr!");
		}
	
	}

}
