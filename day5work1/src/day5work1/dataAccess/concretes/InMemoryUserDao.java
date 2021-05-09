package day5work1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5work1.dataAccess.abstracts.UserDao;
import day5work1.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
    public List<User>users;
    
    public InMemoryUserDao() {
	this.users=new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		System.out.println("kullanýcý eklendi: "+user.getFirstName()+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullanýcý güncellendi: "+user.getFirstName()+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("kullanýcý silindi: "+user.getFirstName()+user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
