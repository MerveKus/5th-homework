package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import  americanVintage.entities.abstracts.Entity;
import americanVintage.entities.concretes.User;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.UserDao;

public class ValidatorManager implements ValidatorService{
	String regex ="[a-z0-9&&[^çðýöþü]]+[@].(com|org|net|edu|gov|biz|info|io)";
	Pattern pattern=Pattern.compile(regex);
	public ValidatorManager(UserDao userDao) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean userMailCheck(User user) {
	Matcher matcher=pattern.matcher(user.getEmailAddress());
	if(user.getEmailAddress().matches(regex) ) {
		
		return true;
	}

	else {
		System.out.println ("Geçerli bir e-mail adresi girmediniz.");}
	return false;
	}

	@Override
	public boolean userNameCheck(User user) {
		if(user.getFirstName().length()>=2) {
			return true;
		}
		
		else {
			System.out.println ("Lütfen, en az 2 karakter içeren bir isim tanýmlayýnýz.");
		}
		return false;
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getUserPassword().length()>=5) {
			return true;
		
	}
		else {
			System.out.println ("Lütfen, en az 5 karakter içeren bir þifre tanýmlayýnýz.");
		}
		return false;
	}



	
}
