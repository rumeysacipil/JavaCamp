package day5work1.core.abstracts;

import day5work1.entities.concretes.User;


public interface EmailVerificationService {
void emailverification(User user);
boolean verification(User user);

}
