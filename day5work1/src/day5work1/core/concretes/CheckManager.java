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
			throw new ArithmeticException("�sminiz en az 2 karakterden olu�mal�d�r!");

		}
	}

	@Override
	public boolean checklastName(String lastName) {
		if(lastName.length()>1) {
			return true;
		}
		else {
			throw new ArithmeticException("�sminiz en az 2 karakterden olu�mal�d�r!");
		}
	}

	@Override
	public boolean checkemail(String email) {
		
		Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher m = p.matcher(email);



		if (m.find()) {
			return true;
		} else {
			System.out.println("Ge�erli bir e-posta adresi giriniz!");
			return false;
		}
	}

	@Override
	public boolean checkpassword(String password) {
		if(password.length()>5) {
			return true;
		}
		else {
			throw new ArithmeticException("parolan�z en az 6 karakterden olu�mal�d�r!");
		}
	
	}

}
