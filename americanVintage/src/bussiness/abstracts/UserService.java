package bussiness.abstracts;

import java.util.List;

import americanVintage.entities.concretes.User;

public interface UserService {

	public void register (User user);
	
	public void login (User user);
	
	User getByEmail(String email);
	List<User>Getall();
	
	
	
	
}
