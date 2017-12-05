package org.csci4448.controllers;

public class AdminAccount extends Account {



	AdminAccount( int accountid, String email, String username, String password)
	{
		this.accountID = accountid;
		this.email = email;
		this.password = password;
		this.userName = username;
	}
	@Override
	Boolean editStory(int storyID, String content) {
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
