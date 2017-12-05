package org.csci4448.controllers;

public abstract class Account {
	
	// Each account has a unique accountID.
	protected int accountID;
	// Each account has an associated email.
	protected String email;
	// Each account has a userName.
	protected String userName;
	
	/*
	 * Each account has a password. 
	 * Don't store in plaintext. When a user creates an account, they enter a password in plaintext. We must use bcrypt 
	 * (https://docs.spring.io/spring-security/site/docs/current/apidocs/org/springframework/security/crypto/bcrypt/BCrypt.html)
	 * to hash the password, and we will store the hash in the DB. When a user tries to log in, the plaintext password they
	 * enter will get hashed using the same hash function above (bcrypt), and we will check that hash against the stored hash
	 * in the DB. If they match, the user entered the correct password and we will continue. If they don't match, the user
	 * entered an incorrect password.
	 */
	String password;
	
	/* 
	 * Each account has a list of stories. (Like viewing a Facebook profile, one 
	 * may view a user's post history.
	 */
	Story[] listOfStories;

	public void setEmail(String e){
		email = e;
	}
	public String getEmail(){
		return email;
	}
	public void setUserName(String n){
		userName = n;
	}
	public String getUserName(){
		return userName;
	}
	
	Boolean addStory(String storyContent) {
		/* TODO
		 * Adding a story should work the same for both admins and users.
		 */
		return null;
	}
	// TODO Editing a story may be different for admins vs. users.
	abstract Boolean editStory(int storyID);
	// TODO Deleting a story may be different for admins vs. users.
	abstract Boolean deleteStory(int storyID);
	
	// TODO Deleting an account may differ for admins vs. users.
	abstract Boolean deleteAccount(int accountID);
	void notifyAllStories() {
		/* TODO
		 * Notifying all stories of should work the same for admins vs. users.
		 */
	}
	
}
