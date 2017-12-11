import java.util.ArrayList;

public class Story {
	
	// Each story has a unique storyID.
	int storyID;
	int accountID;
	// Each story has some content.
	String storyContent;
	// Each story has a list of contents (may be empty).
	ArrayList<Comment> listOfComments = new ArrayList<Comment>();

	Story(String content, int ID){
		//TODO generate unique ID
		accountID = ID;
		storyContent = content;
	}

	void addComment(String content){
		listOfComments.add(new Comment(content));
	}

	void deleteComment(int cNum) {
		listOfComments.remove(cNum);
	}
	
	void notifyAllComments() {
		/*
		 * TODO Method that notifies all of the current
		 * story's comments.
		 */
	}

	int getStoryID()
	{
		return storyID;
	}
	void setStoryContent(String content)
	{
		storyContent = content;
	}
}
