package org.csci4448.controllers;

public class Comment {
	
	// Each comment has a unique commentID.
	int commentID;
	// Each comment has some content.
	String commentContent;

	Comment(String content){
		//TODO Generate unique ID
		commentContent = content;
	}
	
}
