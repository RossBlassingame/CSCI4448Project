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

	public int getAccountID()
	{
		return this.accountID;
	}
	public void setAccountID(int id)
	{
		this.accountID = id;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String _email)
	{
		email = _email;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserName(String username)
	{
		this.userName = username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
