
public class UserAccount extends Account {



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
	
}
