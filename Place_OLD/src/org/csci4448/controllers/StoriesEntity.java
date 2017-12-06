package org.csci4448.controllers;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Stories", schema = "PlaceDB", catalog = "")
public class StoriesEntity {
    private int storyId;
    private Integer accountId;
    private String content;

    @Id
    @Column(name = "storyID", nullable = false)
    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
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
    @Column(name = "content", nullable = true, length = 500)
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
        StoriesEntity that = (StoriesEntity) o;
        return storyId == that.storyId &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(storyId, accountId, content);
    }
}
