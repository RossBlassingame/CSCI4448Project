package org.csci4448.controllers;

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

	void deleteComment(int cNum) {
		listOfComments.remove(cNum);
	}
	
	void notifyAllComments() {
		/*
		 * TODO Method that notifies all of the current
		 * story's comments.
		 */
	}

	public int getStoryID()
	{
		return storyID;
	}
	public void setStoryID(int _id){
		storyID = _id;
	}
	public String getStoryContent(){
		return storyContent;
	}
	public void setStoryContent(String content)
	{
		storyContent = content;
	}

}
