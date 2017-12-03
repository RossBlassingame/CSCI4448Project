import java.util.ArrayList;

public class Story {
	
	// Each story has a unique storyID.
	int storyID;
	// Each story has some content.
	String storyContent;
	// Each story has a list of contents (may be empty).
	ArrayList<Comment> listOfComments = new ArrayList<Comment>();

	Story(String content){
		//TODO generate unique ID
		storyContent = content;
	}

	void addComment(String content){
		listOfComments.add(new Comment(content));
	}

	void notifyAllComments() {
		/*
		 * TODO Method that notifies all of the current
		 * story's comments.
		 */
	}
	
}
