package org.csci4448.controllers;

import java.util.ArrayList;

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
	protected String password;
	protected int storyCount = 0;
	/* 
	 * Each account has a list of stories. (Like viewing a Facebook profile, one 
	 * may view a user's post history.
	 */

	ArrayList<Story> listOfStories = new ArrayList<Story>();
	
	public Boolean addStory() {
		Story story = new Story();
		storyCount++;
		listOfStories.add(story);

		return null;
	}

	public void addStoryToList(Story s){
		storyCount++;
		listOfStories.add(s);
	}

	public Story getStoryAtIndex(int i){
		return listOfStories.get(i);
	}

	public int getSizeOfStoryList(){
		return listOfStories.size();
	}

	abstract Boolean editStory(int storyID, String content);
	abstract Boolean deleteStory(int storyID);
	
	abstract Boolean deleteAccount(int accountID);
	void notifyAllStories() {

	}
	
}
