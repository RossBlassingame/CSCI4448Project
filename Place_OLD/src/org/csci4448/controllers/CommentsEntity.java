package org.csci4448.controllers;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Comments", schema = "PlaceDB", catalog = "")
public class CommentsEntity {
    private int commentId;
    private Integer storyId;
    private Integer accountId;
    private String content;

    @Id
    @Column(name = "commentID", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "storyID", nullable = true)
    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    @Basic
    @Column(name = "accountID", nullable = true)
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 200)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsEntity that = (CommentsEntity) o;
        return commentId == that.commentId &&
                Objects.equals(storyId, that.storyId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, storyId, accountId, content);
    }
}
