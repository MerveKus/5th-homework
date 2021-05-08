package dataAccess.abstracts;

import java.util.List;

import americanVintage.entities.concretes.User;

public interface UserDao {
	public void add(User User);
	public void login(User user);
	public void delete(User user);
	List<User> getAll();
	User getby(String email);

}
