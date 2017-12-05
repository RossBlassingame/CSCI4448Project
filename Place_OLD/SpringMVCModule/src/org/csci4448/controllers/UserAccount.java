package org.csci4448.controllers;

public class UserAccount extends Account {

	UserAccount(){

	}

	UserAccount( int accountid, String email, String username, String password)
	{
		this.accountID = accountid;
		this.email = email;
		this.password = password;
		this.userName = username;
	}
	@Override
	Boolean editStory(int storyID, String content) {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.listOfStories.size(); i++)
		{
			if( this.listOfStories.get(i).getStoryID() == storyID)
			{
				this.listOfStories.get(i).setStoryContent(content);
				return true;
			}
		}

		return false;
	}

	@Override
	Boolean deleteStory(int storyID) {
		for(int i = 0; i < this.listOfStories.size(); i++)
		{
			if( this.listOfStories.get(i).getStoryID() == storyID)
			{
				this.listOfStories.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	Boolean deleteAccount(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	int getAccountID()
	{
		return this.accountID;
	}
	void setAccountID(int id)
	{
		this.accountID = id;
	}
	String getEmail()
	{
		return this.email;
	}
	void setEmail(String email)
	{
		this.email = email;
	}
	String getUserName()
	{
		return this.userName;
	}
	void setUserName(String username)
	{
		this.userName = username;
	}
	String getPassword()
	{
		return this.password;
	}
	void setPassword(String password)
	{
		this.password = password;
	}
	
}
