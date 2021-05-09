package day5work1.business.abstracts;

import day5work1.entities.concretes.User;

public interface UserService {
void register(User user);
void login(String email,String password);
void loginWithService();
void registerWithService();
}
