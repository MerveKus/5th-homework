import americanVintage.entities.concretes.User;
import bussiness.abstracts.UserService;
import bussiness.concretes.UserManager;
import core.abstracts.ValidatorService;
import core.concretes.ValidatorManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao= new HibernateUserDao();
		
		UserService userservice= new UserManager(new HibernateUserDao());
		ValidatorService validatorService= new ValidatorManager(userDao);
	
		UserService userManager= new UserManager(userDao);
		User user1= new User("Merve","Kuþ", "abc@gmail.com", "123456");
		validatorService.passwordCheck(user1);
		userDao.add(user1);
		
		
		
		
		
		
		
		

	}

}
