package core.abstracts;

import americanVintage.entities.concretes.User;

public interface ValidatorService {
	public boolean userMailCheck (User user);
	public boolean userNameCheck (User user);
	public boolean passwordCheck(User user);

}
