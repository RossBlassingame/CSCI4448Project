package org.csci4448.controllers;

public class UserAccount extends Account {

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
	public void setPassword(String n){
		password = n;
	}
	public String getPassword(){
		return password;
	}

	@Override
	Boolean editStory(int storyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Boolean deleteStory(int storyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Boolean deleteAccount(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
