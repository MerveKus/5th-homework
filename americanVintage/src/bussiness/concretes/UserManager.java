package bussiness.concretes;

import java.util.List;

import americanVintage.entities.concretes.User;
import bussiness.abstracts.UserService;
import dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		
		super();
		this.userDao = userDao;
	}
	

	@Override
	public void register(User user) {
		userDao.add(user);		
	}

	@Override
	public void login(User user) {
		userDao.login(user);
		
	}

	@Override
	public List<User> Getall() {
	return userDao.getAll();
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getby(email);
		}

	
	

}
