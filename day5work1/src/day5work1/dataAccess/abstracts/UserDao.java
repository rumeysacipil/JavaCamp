package day5work1.dataAccess.abstracts;

import java.util.List;



import day5work1.entities.concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
List<User>getAll();
}
