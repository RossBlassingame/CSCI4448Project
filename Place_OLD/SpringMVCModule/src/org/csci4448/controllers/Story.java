package org.csci4448.controllers;

import java.util.ArrayList;

public class Story {
	
	// Each story has a unique storyID.
	int storyID;
	// Each story has some content.
	String story;
	// Each story has a list of contents (may be empty).
	ArrayList<Comment> listOfComments = new ArrayList<Comment>();

	void addComment(String content){
		listOfComments.add(new Comment(content));
	}

	void deleteComment(int cNum) {
		listOfComments.remove(cNum);
	}


	public int getStoryID()
	{
		return storyID;
	}
	public void setStoryID(int _id){
		storyID = _id;
	}
	public String getStory(){
		return story;
	}
	public void setStory(String s){ story = s; };
	public void setStoryContent(String content)
	{
		story = content;
	}

}
