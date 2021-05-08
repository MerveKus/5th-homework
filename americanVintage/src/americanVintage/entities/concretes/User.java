package americanVintage.entities.concretes;

import americanVintage.entities.abstracts.Entity;

public class User implements Entity {
	private String firstName;
	private String surName;
	private String emailAddress;
	private String userPassword;
	
	
 public User (){
}


public User(String firstName, String surName, String emailAddress, String userPassword) {
	super();
	this.firstName = firstName;
	this.surName = surName;
	this.emailAddress = emailAddress;
	this.userPassword = userPassword;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getSurName() {
	return surName;
}


public void setSurName(String surName) {
	this.surName = surName;
}


public String getEmailAddress() {
	return emailAddress;
}


public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


public String getUserPassword() {
	return userPassword;
}


public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
 
 
 
}



