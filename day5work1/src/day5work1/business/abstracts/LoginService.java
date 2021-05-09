package day5work1.business.abstracts;

import day5work1.entities.concretes.User;

public interface LoginService {
void emailAvailable(String email);
void login(String email,String password);
void register(User user);
}
