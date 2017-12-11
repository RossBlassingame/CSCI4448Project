
public class Comment {

    // Each comment has a unique commentID.
    int commentID;
    int storyID;
    int accountID;
    // Each comment has some content.
    String commentContent;

    Comment(int sID, int aID, String content, ){
        storyID = sID;
        accountID = aID;
        commentContent = content;
    }

}
