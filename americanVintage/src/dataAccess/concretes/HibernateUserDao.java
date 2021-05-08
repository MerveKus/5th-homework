package dataAccess.concretes;

import java.util.List;

import americanVintage.entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User User) {
		System.out.println("Kullanıcı veritabanına eklendi");
		
	}

	@Override
	public void login (User user) {
		System.out.println("Kullanıcı bilgileri veritabanında güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı bilgileri veritabanından silindi");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getby(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
